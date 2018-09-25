package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;
import org.junit.Assert;
import org.junit.Test;

public class ProcessoDeMatriculaTest {
    @Test
    public void processarMatriculaTest(){
        DadosAluno dados = new DadosAluno("123456789", "Exemple", "exemple@exemple.com");
        ComprovanteMatricula comprovante;
        ProcessoDeMatricula processoDeMatricula = new ProcessoDeMatricula(new Curso("Analise e desenvolvimento de sistemas", "ADSnewGrade", "Tecnologo","Graduação",new Turma("ADS2018")));
        comprovante = processoDeMatricula.processarMatricula(dados,"ADS2018");
        Assert.assertNotNull(comprovante);
        Assert.assertEquals(comprovante.getAluno().getCpf(), dados.getCpf());
    }
}
