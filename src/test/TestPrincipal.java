package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import tabuleiro.Posicao;

public class TestPrincipal {
	
	private Posicao posicao;
	
	@Before
	public void inicializaPosicao() {
		posicao = new Posicao(3, 4);
	}
	
	@Test
	public void testaLinha() {
		posicao = new Posicao(1, 2);
		assertEquals(1, posicao.getLinha());
	}
	
	@Test
	public void testaColuna() {
		posicao = new Posicao(8, 6);
		assertEquals(6, posicao.getColuna());
	}
	
	@Test
	public void testaSaida() {
		posicao = new Posicao(1, 7);
		assertEquals("Linha: 1 - Coluna: 7", posicao.toString());
	}
}
