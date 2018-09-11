package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Curso {
	private String nomeDoCurso;
	private String codigoCurso;
	private String tipoDoCurso;
	private String grauDoCurso;
	private Collection<Turma> turmas;
	public Curso(String nomeDoCurso, String codigoCurso, String tipoDoCurso, String grauDoCurso, Turma turmaIni){

	    /*  Esse construtor deve ser feito desse seguinte jeito:
            Para haver um curso é deve pelo menos ter uma turma e nessa turma
            um aluno
	    * */
		this.nomeDoCurso = nomeDoCurso;
		this.codigoCurso = codigoCurso;
		this.grauDoCurso = grauDoCurso;
		this.tipoDoCurso = tipoDoCurso;
		this.turmas = new ArrayList<>();
		this.turmas.add(turmaIni);
	}
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}
	public String getNomeDoCurso(){
		return this.nomeDoCurso;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public String getGrauDoCurso() {
		return grauDoCurso;
	}

	public String getTipoDoCurso() {
		return tipoDoCurso;
	}
	public boolean equals(Curso o){
		boolean result = false;
		if(this.codigoCurso == o.codigoCurso){
			result = true;
		}
		return result;
	}
	public void adicionarTurma(Turma turma){
	    this.turmas.add(turma);
    }
	public Turma buscarTurma(String idTurma){
        for(Turma o : turmas){
            if(o.getIdTurma() == idTurma){
                return o;
            }
        }
        return null;
    }
    public Collection<Aluno> buscarTurma(){
	    //Todos
        Collection<Aluno> result = new ArrayList<>();
        for(Turma o : turmas){
            for(Aluno k : o.getAlunos()){
                result.add(k);
            }
        }
        return result;
    }

}
