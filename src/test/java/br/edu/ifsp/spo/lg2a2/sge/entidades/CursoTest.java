package br.edu.ifsp.spo.lg2a2.sge.entidades;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CursoTest {
    @Test
    private void equalsTest(){
        //Configuração
        Curso c1 = new Curso("Analise e desenvolvimento de Sistemas","adsNewgrade","Tecnologo", "Graduação", new Turma(new ArrayList<>(), ""));
        Curso c2 = new Curso("Analise e desenvolvimento de Sistemas","adsNewgrade","Tecnologo", "Graduação", new Turma(new ArrayList<>(),""));
        //Asserção
        Assert.assertTrue(c1.equals(c2));
    }
    @Test
    private void bucarTurma(){
        Curso c = new Curso("Analise e desenvolvimento de Sistemas", "AdsNewGrade", "Tecnologo", "Graduação", new Turma((Aluno) null, "Ads1sem"));
        Assert.assertNotNull(c.buscarTurma("Ads1sem"));
    }
}
