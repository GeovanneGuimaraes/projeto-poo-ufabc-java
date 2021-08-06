package jogo_de_xadrez;

import pecas.Bispo;
import pecas.Cavalo;
import pecas.Peao;
import pecas.Rainha;
import pecas.Rei;
import pecas.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Jogo {

	private Tabuleiro tabuleiro;

	// Construtor da classe Tabuleiro, onde � instaciado a dimens�o (8x8) de um
	// tabuleiro de xadrez
	public Jogo() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciaJogo();
	}

	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] auxiliar = new PecaXadrez[8][8];

		// Percorrer a matriz "auxiliar"
		int x = 0, y = 0;
		for (x = 0; x < 8; x = x + 1) {
			for (y = 0; y < 8; y = y + 1) {
				auxiliar[x][y] = (PecaXadrez) tabuleiro.peca(x, y);
			}
		}
		return auxiliar;
	}
	
	//Coloca a peça nova de acordo com as posições originais do xadrez
	public void pecaNova(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocaPeca(peca, new JogoPosicao(coluna, linha).irPosicao());
	}
	
	// Posiciona as peças no tabuleiro
	public void iniciaJogo() {

		// Peças Pretas
		Torre torreP = new Torre(tabuleiro, CoresPecas.Preto);
		Rei reiP = new Rei(tabuleiro, CoresPecas.Preto);
		Cavalo cavaloP = new Cavalo(tabuleiro, CoresPecas.Preto);
		Bispo bispoP = new Bispo(tabuleiro, CoresPecas.Preto);
		Peao peaoP = new Peao(tabuleiro, CoresPecas.Preto);
		Rainha rainhaP = new Rainha(tabuleiro, CoresPecas.Preto);

		// Peças Brancas
		Torre torreB = new Torre(tabuleiro, CoresPecas.Branco);
		Rei reiB = new Rei(tabuleiro, CoresPecas.Branco);
		Cavalo cavaloB = new Cavalo(tabuleiro, CoresPecas.Branco);
		Bispo bispoB = new Bispo(tabuleiro, CoresPecas.Branco);
		Peao peaoB = new Peao(tabuleiro, CoresPecas.Branco);
		Rainha rainhaB = new Rainha(tabuleiro, CoresPecas.Branco);

		// Torres Pretas
		pecaNova('a', 1, torreP);
		pecaNova('h', 1, torreP);

		// Torres Brancas
		pecaNova('a', 8, torreB);
		pecaNova('h', 8, torreB);

		// Cavalos Pretos
		pecaNova('b', 1, cavaloP);
		pecaNova('g', 1, cavaloP);
		// Cavalos Brancos
		pecaNova('b', 8, cavaloP);
		pecaNova('b', 8, cavaloP);

		// Bispos Pretos
		tabuleiro.colocaPeca(bispoP, new Posicao(0, 2));
		tabuleiro.colocaPeca(bispoP, new Posicao(0, 5));
		// Bispos Brancos
		tabuleiro.colocaPeca(bispoB, new Posicao(7, 2));
		tabuleiro.colocaPeca(bispoB, new Posicao(7, 5));

		// Rei Preto
		tabuleiro.colocaPeca(reiP, new Posicao(0, 4));
		// Rei Branco
		tabuleiro.colocaPeca(reiB, new Posicao(7, 4));

		// Rainha Preta
		tabuleiro.colocaPeca(rainhaP, new Posicao(0, 3));
		// Rainha Branca
		tabuleiro.colocaPeca(rainhaB, new Posicao(7, 3));
		
		//Bispos Pretos
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 0));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 1));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 2));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 3));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 4));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 5));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 6));
		tabuleiro.colocaPeca(peaoP, new Posicao(1, 7));
		
		//Bispos Brancos
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 0));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 1));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 2));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 3));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 4));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 5));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 6));
		tabuleiro.colocaPeca(peaoB, new Posicao(6, 7));
		
		

	}
}
