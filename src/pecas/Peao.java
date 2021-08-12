package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Peao extends PecaXadrez {
	
	//Construtor da subclasse Peao
	public Peao(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna a peca Peao "P" 
	public String toString() {
		return "P";
	}
}
