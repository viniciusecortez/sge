package br.edu.ifsp.spo.lg2a2.sge.vo;

public class DadosAluno {
	private String cpf;
	private String nome;
	private String email;
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	
	public DadosAluno(String cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
}
