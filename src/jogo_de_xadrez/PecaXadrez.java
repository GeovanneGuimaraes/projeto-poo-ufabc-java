package jogo_de_xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca {
	
	private CoresPecas cor;
	
	//Construtor da peca de xadrez
	public PecaXadrez(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	
	// Get e Set do atributo cor
	public void setCor(CoresPecas cor) {
		this.cor = cor;
	}
	
	public CoresPecas getCor() {
		return cor;
	}
	
	public boolean temPecaAdversaria(Posicao posicao) {
		PecaXadrez peca = (PecaXadrez)getTabuleiro().peca(posicao);
		return peca != null && peca.getCor() != cor;
	}
	

}
