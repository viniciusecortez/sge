package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	private String nomeDoCurso;
	private String codigoCurso;
	private String tipoDoCurso;
	private String grauDoCurso;
	private Collection<Turma> turmas;
	public Curso(String nomeDoCurso, String codigoCurso, String tipoDoCurso, String grauDoCurso){
		this.nomeDoCurso = nomeDoCurso;
		this.codigoCurso = codigoCurso;
		this.grauDoCurso = grauDoCurso;
		this.tipoDoCurso = tipoDoCurso;
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
}
