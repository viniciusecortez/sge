package br.edu.ifsp.spo.lg2a2.sge.entidades;

public class Aluno {
	
	private String prontuario;
	private String cpf;
	private String nome;
	private String email;
	private Curso curso;
	
	public String getProntuario() {
		return prontuario;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}

    public Curso getCurso() {
        return curso;
    }

    public Aluno(String prontuario, String cpf, String nome, String email) {
		this.prontuario = prontuario;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
	public String toString() {
		return "<prontuario: " 
				+ this.getProntuario() 
				+ ", cpf: " + this.getCpf()
				+ ", nome: " + this.getNome() + ">";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			
			Aluno other = (Aluno)obj;
			
			resultado = 
					this.getProntuario().equals(other.getProntuario());
			resultado = resultado &&
					this.getCpf().equals(other.getCpf());
		}
		
		return resultado;
	}
	
}
