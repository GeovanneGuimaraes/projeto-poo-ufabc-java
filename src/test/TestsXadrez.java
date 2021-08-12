package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import jogo_de_xadrez.Jogo;
import pecas.Bispo;
import pecas.Cavalo;
import pecas.Peao;
import pecas.Rainha;
import pecas.Rei;
import pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroExcecao;

public class TestsXadrez {

	private Posicao posicao;
	private Tabuleiro tabuleiro;
	private Jogo jogo;
	private Bispo bispoP;
	private Rei reiP;
	private Rainha rainhaP;
	private Peao peaoP;
	private Torre torreP;
	private Cavalo cavaloP;
	private Bispo bispoB;
	private Rei reiB;
	private Rainha rainhaB;
	private Peao peaoB;
	private Torre torreB;
	private Cavalo cavaloB;

	//Inicializa previamente as classes
	@Before
	public void inicializar() {
		posicao = new Posicao(3, 4);
		tabuleiro = new Tabuleiro(8, 8);
		jogo = new Jogo();
	}

	//Testa as colunas
	@Test
	public void testaColunas() {
		posicao = new Posicao(8, 7);
		tabuleiro = new Tabuleiro(4, 3);
		assertEquals(7, posicao.getColuna());
		assertEquals(3, tabuleiro.getColunas());
		
		posicao = new Posicao(6, 2);
		tabuleiro = new Tabuleiro(5, 4);
		assertEquals(2, posicao.getColuna());
		assertEquals(4, tabuleiro.getColunas());
		
		posicao = new Posicao(5, 5);
		tabuleiro = new Tabuleiro(9, 1);
		assertEquals(5, posicao.getColuna());
		assertEquals(1, tabuleiro.getColunas());
	}
	
	@Test
	public void testaLinhas() {
		// LINHAS
		posicao = new Posicao(3, 4);
		tabuleiro = new Tabuleiro(8, 8);
		assertEquals(3, posicao.getLinha());
		assertEquals(8, tabuleiro.getLinhas());
		
		posicao = new Posicao(7, 4);
		tabuleiro = new Tabuleiro(7, 8);
		assertEquals(7, posicao.getLinha());
		assertEquals(7, tabuleiro.getLinhas());
		
		posicao = new Posicao(1, 4);
		tabuleiro = new Tabuleiro(3, 8);
		assertEquals(1, posicao.getLinha());
		assertEquals(3, tabuleiro.getLinhas());
	}
	

	//Testa as peças de xadrez
	@Test
	public void testaPeçasXadrez() {

		assertEquals('B', bispoP);
		assertEquals('P', peaoP);
		assertEquals('R', reiP);
		assertEquals('Q', rainhaP);
		assertEquals('T', torreP);
		assertEquals('C', cavaloP);
		
		assertEquals('B', bispoB);
		assertEquals('P', peaoB);
		assertEquals('R', reiB);
		assertEquals('Q', rainhaB);
		assertEquals('T', torreB);
		assertEquals('C', cavaloB);
	}

	//Testa se a posição existe no tabuleiro
	@Test
	public void testaTemPosicao() {
		assertEquals(true, tabuleiro.temPosicao(posicao.getLinha(), posicao.getColuna()));
		assertEquals(false, tabuleiro.temPosicao(9, 12));
	}
	
	//Testa se a formatação da posicão está correta
	@Test
	public void testaPosicao() {
		posicao = new Posicao(1, 7);
		assertEquals("Linha: 1 - Coluna: 7", posicao.toString());
	}
	
	
	//Testa a exceção se existe a peça numa dada posição
	@Test(expected=TabuleiroExcecao.class)
	public void temPeca() {
		try {
			posicao = new Posicao(12, 14);
			tabuleiro.temPeca(posicao);
		}catch (TabuleiroExcecao e) {
			assertEquals("Erro: Nao existe a posicao desejada no tabuleiro", e.getMessage());
			throw e;
		}
		
	}
	
	//Testa a exceção se existe uma certa peça a ser removida do tabuleiro
	@Test(expected=TabuleiroExcecao.class)
	public void removerPeca() {
		try {
			posicao = new Posicao(9, 7);
			tabuleiro.temPeca(posicao);
		}catch (TabuleiroExcecao e) {
			assertEquals("Erro: Nao existe a posicao desejada no tabuleiro", e.getMessage());
			throw e;
		}
		
	}
	
	
}
