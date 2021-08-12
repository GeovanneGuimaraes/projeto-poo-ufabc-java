package jogo_de_xadrez;

import pecas.Bispo;
import pecas.Cavalo;
import pecas.Peao;
import pecas.Rainha;
import pecas.Rei;
import pecas.Torre;
import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Jogo {

	private Tabuleiro tabuleiro;

	// Construtor da classe Tabuleiro, onde eh instaciado a dimensao (8x8) de um
	// tabuleiro de xadrez
	public Jogo() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciaJogo();
	}

	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] auxiliar = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

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
	
	
	public void validarOrigemPos(Posicao posicao) {
		if (!tabuleiro.temPeca(posicao)) {
			throw new JogoExcecao("Erro: Nao existe a posicao desejada no tabuleiro");
		}
	}
	
	
	//Movendo as peças
	public PecaXadrez moverPeca(JogoPosicao origemPos, JogoPosicao destinoPos) {
		Posicao origem = origemPos.irPosicao();
		Posicao destino = destinoPos.irPosicao();
		validarOrigemPos(origem);
		Peca pecaCapturada = movimentar(origem, destino);
		return (PecaXadrez)pecaCapturada;
	}
	
	public Peca movimentar(Posicao origem, Posicao destino) {
		Peca peca = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.colocaPeca(peca, destino);
		return pecaCapturada;
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
		pecaNova('b', 8, cavaloB);
		pecaNova('g', 8, cavaloB);

		// Peao Pretos
		pecaNova('a', 2, peaoP);
		pecaNova('b', 2, peaoP);
		pecaNova('c', 2, peaoP); 
		pecaNova('d', 2, peaoP);
		pecaNova('e', 2, peaoP);
		pecaNova('f', 2, peaoP);
		pecaNova('g', 2, peaoP);
		pecaNova('h', 2, peaoP);
		// Peaos Brancos
		pecaNova('a', 7, peaoB);
		pecaNova('b', 7, peaoB);
		pecaNova('c', 7, peaoB);
		pecaNova('d', 7, peaoB);
		pecaNova('e', 7, peaoB);
		pecaNova('f', 7, peaoB);
		pecaNova('g', 7, peaoB);
		pecaNova('h', 7, peaoB);

		// Rei Preto
		pecaNova('e', 1, reiP);
		// Rei Branco
		pecaNova('e', 8, reiB);

		// Rainha Preta
		pecaNova('d', 1, rainhaP);
		// Rainha Branca
		pecaNova('d', 8, rainhaB);
		
		//Bispos Pretos
		pecaNova('c', 1, bispoP);
		pecaNova('f', 1, bispoP);
		//Bispos Brancos
		pecaNova('c', 8, bispoB);
		pecaNova('f', 8, bispoB);
	}
}
