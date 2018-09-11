package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;


import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
	private static Collection<Curso> cursos;
	public Curso buscarPorCodigo(String codigo) {
		for(Curso c: cursos){
		    if(c.getCodigoCurso() == codigo){
		        return c;
            }

        }
        return null;
	}
	public CursosRepository(Curso[] cursos){
	    if(CursosRepository.cursos == null){
            CursosRepository.cursos = new ArrayList<Curso>(Arrays.asList(cursos));
        }else{
	        for(Curso o : cursos){
	            CursosRepository.cursos.add(o);
            } } }

    public CursosRepository(){}
	public Turma buscarTurma(String codigoCurso, String codigoDaTurma){
	    for(Curso o: cursos){
	        if(o.getCodigoCurso() == codigoCurso){
	            return o.buscarTurma(codigoDaTurma);
            }
        }
        return null;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		Collection<Aluno> alunosDoCurso ;
		for(Curso o: cursos){
		    if(o.getCodigoCurso() == codigoCurso){
		        return o.buscarTurma();
            }
        }
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
	    Collection<Aluno> alunos = new ArrayList<>();
        for(Curso curso : cursos){
            for(Aluno aluno : curso.buscarTurma()){
                alunos.add(aluno);
            }
        }
		for(Aluno aluno : alunos){
		    if(aluno.getCpf() == cpf){
		        return true;
            }
        }
        return false;
	}
	
	public void adicionarAluno(Aluno aluno, String idTurma, String idCurso) {
	    for(Curso curso: cursos){
	        if(curso.getCodigoCurso() == idCurso){
	            for(Turma turma : curso.getTurmas()){
	                if(turma.getIdTurma() == idTurma){
	                    turma.addAluno(aluno);
	                    return ;
                    }
                }
            }
	    }

	}
}
