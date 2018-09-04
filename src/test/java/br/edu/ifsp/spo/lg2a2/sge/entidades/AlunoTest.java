package br.edu.ifsp.spo.lg2a2.sge.entidades;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlunoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEqualsObject() {
		//1. Configuracao
		Aluno a = new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org");
		Aluno b = new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org");
		//2. Execução
		boolean resultado1 = a.equals(b);
		boolean resultado2 = b.equals(a);
		//3. Asserção
		assertTrue(resultado1);
		assertTrue(resultado2);
	}

}
