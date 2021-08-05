package jogo_de_xadrez;

import tabuleiro.Tabuleiro;

public class Jogo {
	
	private Tabuleiro tabuleiro;
	
	//Construtor da classe Tabuleiro, onde é instaciado a dimensão (8x8) de um tabuleiro de xadrez
	public Jogo() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] auxiliar = new PecaXadrez[8][8];
		
		//Percorrer a matriz "auxiliar"
		int x=0, y=0;
		for(x=0; x<8; x=x+1) {
			for(y=0; y<8; y=y+1) {
				auxiliar[x][y] = (PecaXadrez) tabuleiro.peca(x, y);
			}
		}
		return auxiliar;
	}	
}
