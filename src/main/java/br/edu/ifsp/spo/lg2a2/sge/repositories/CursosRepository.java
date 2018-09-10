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
		return null;
	}
	public CursosRepository(){
	    if(cursos == null){

            Curso [] todos = {new Curso("Analise e Desenvolvimento de Sistemas", "adsnewgrade", "Tecnologia", "Graduação"),
                    new Curso("Sistemas Eletricos", "sisEletric", "Tecnologia", "Graduação"),
                    new Curso("Engenharia Civil", "engCivil", "Bacharel", "Graduação"),
                    /*Terminar*/};
            cursos = new ArrayList<Curso>(Arrays.asList(todos));
        }

	}
	public Collection<Turma> buscarTurmas(String codigoCurso){
		return null;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		return false;
	}
	
	public void adicionarAluno(Aluno aluno) {
	}
}
