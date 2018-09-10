package br.edu.ifsp.spo.lg2a2.sge.repositories;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CursoRepositoryTest {
    @Before
    public void setUp(){
        Aluno aluno1 = new Aluno("SP3000", "123456789","EXE1", "EXE1@Exemple.com");
        Aluno aluno2 = new Aluno("SP3001", "123456790","EXE1", "EXE1@Exemple.com");
        Aluno aluno3 = new Aluno("SP3002", "123456791", "EXE1", "EXE1@Exemple.com");
        Curso[] n = new Curso[]{new Curso("Analise e desenvolvimento de Sistemas", "adsNewGrade", "Tecnologia", "Graduação", new Turma(aluno1,"t001")),
                new Curso("Engenharia Civil", "EngCivil", "Bacharel", "Graduação", new Turma(aluno2,"e001")),
                new Curso("Engenharia Eletrica", "EngEle", "Bacharel", "Graduação", new Turma(aluno3, "k001"))};
        CursosRepository repository = new CursosRepository(n);
    }
    @Test
    public void buscarPorCodigoTest(){
        //Configuração
        CursosRepository repository = new CursosRepository();
        //Execução
        Curso n = repository.buscarPorCodigo("EngCivil");
        //Assert
        Assert.assertNotNull(n);
    }
    @Test
    public void adicionarAlunoTest(){
        //Configuração
        CursosRepository repository = new CursosRepository();
        Aluno novo = new Aluno("SP3004", "30040", "EXE", "EXE@exemple.com");
        boolean v;
        //Execução
        repository.adicionarAluno(novo,"t001","adsNewGrade");
        v = repository.existeAlunoNoCurso("30040");
        //Assert
        Assert.assertTrue(v);

    }
}
