package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;
import br.edu.ifsp.spo.lg2a2.sge.repositories.AlunosRepository;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;

import java.util.Random;

public class ProcessoDeMatricula {
	
	private Curso curso;

	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
	}

	public SituacaoMatricula verificarExistenciaAluno(String cpf) {
		SituacaoMatricula opcao;
		AlunosRepository n = new AlunosRepository();
		if(n.buscarPorCpf(cpf) == null){
		    opcao = SituacaoMatricula.Novo;
        }else if(n.buscarPorCpf(cpf).getCurso() != curso){
		    opcao = SituacaoMatricula.Cadastrado;
        }else {
		    opcao = SituacaoMatricula.CadastradoNoCurso;
        }
        return opcao;
	}
	
	public ComprovanteMatricula processarMatricula(DadosAluno dados, String idTurma) {
	    switch (verificarExistenciaAluno(dados.getCpf())){
            case Novo:
                String prontuario = gerarProntuario();
                AlunosRepository repository = new AlunosRepository();
                //Criação de um novo aluno
                Aluno novo = new Aluno(prontuario, dados.getCpf(), dados.getNome(), dados.getEmail());
                //Vinculando ele a um curso
                novo.setCurso(curso);
                //Colocando no repositorio de alunos:
                repository.adicionar(novo);
                //Colocando na determinada turma
                Turma turma = curso.buscarTurma(idTurma);
                turma.addAluno(novo);
                return new ComprovanteMatricula(novo, turma);
            case Cadastrado:
                System.err.println("Aluno já cadestrado!");
                break;
            case CadastradoNoCurso:
                System.err.println("Aluno já cadastrado nesse curso!!!!!!!!!!");
                break;

        }
        return null;
	}
	
	private String gerarProntuario() {
		Random random = new Random();
		Integer result = random.nextInt(10000000);
        AlunosRepository n = new AlunosRepository();
		if(n.buscarPorProntuario(result.toString())!= null){
		    return gerarProntuario();
        }else{
		    return result.toString();
        }
	}
	
}
