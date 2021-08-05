package jogo_de_xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {
	
	private CoresPecas cor;
	
	//Construtor da pe�a de xadrez
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
	
	

}
