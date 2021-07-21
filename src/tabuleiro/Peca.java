package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	//Construtor de Peca
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	//Retornar o tabuleiro
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
