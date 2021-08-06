package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Bispo extends PecaXadrez {
	
	//Construtor da subclasse Bispo
	public Bispo(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna "B" como bispo
	public String toString() {
		return "♗";
	}
	
}
