package br.edu.ifsp.spo.lg2a2.sge.entidades;

import br.edu.ifsp.spo.lg2a2.sge.repositories.AlunosRepository;

import java.util.ArrayList;
import java.util.Collection;

public class Turma {

	public Turma(Collection<Aluno> alunos, String idTurma){ this.alunos = alunos; this.idTurma = idTurma;}
	public Turma(Aluno aluno, String idTurma){
		AlunosRepository n = new AlunosRepository();
		if(n.buscarPorCpf(aluno.getCpf()) == null){
			n.adicionar(aluno);
		}else{

		}



	    this.alunos = new ArrayList<>();
	    this.alunos.add(aluno);
	    this.idTurma = idTurma;
    }
	private Collection<Aluno> alunos;
	private String idTurma;
	public String getIdTurma(){return this.idTurma; }
	public void addAluno(Aluno aluno){
		alunos.add(aluno);
	}
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}
}
