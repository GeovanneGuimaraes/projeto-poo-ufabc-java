package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Rainha extends PecaXadrez{

	//Construtor da subclasse rainha
	public Rainha(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna "Q" (Queen) como Rainha
	public String toString() {
		return "Q";
	}
}
