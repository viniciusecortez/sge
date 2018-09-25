package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.ArrayList;
import java.util.Collection;

public class Matricula {
    private String prontuario;
    private Aluno aluno;
    private Collection<Turma> turmas ;
    public Matricula(String prontuario, Aluno aluno){
        this.prontuario = prontuario;
        this.aluno = aluno;
    }
    
    public void adicionarTurma(Turma turma){
        if(turmas == null){
            turmas = new ArrayList<>();
        }
        turmas.add(turma);
    }

}
