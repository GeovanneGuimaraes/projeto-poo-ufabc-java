package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Cavalo extends PecaXadrez{

	//Construtor da subclasse Cavalo
	public Cavalo(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna "C" como Cavalo
	public String toString() {
		return "♞";
	}
	
	
}
