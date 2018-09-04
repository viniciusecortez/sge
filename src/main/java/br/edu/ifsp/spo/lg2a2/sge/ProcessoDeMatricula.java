package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;

public class ProcessoDeMatricula {
	
	private Curso curso;
	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
	}

	public SituacaoMatricula verificarExistenciaAluno(String cpf) {
		return null;
	}
	
	public ComprovanteMatricula processarMatricula(DadosAluno dados) {
		return null;
	}
	
	private String gerarProntuario() {
		return null;
	}
	
}
