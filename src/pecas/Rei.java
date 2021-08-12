package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Rei extends PecaXadrez{

	//Construtor de Rei
	public Rei(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna "R" como rei no tabuleiro
	public String toString() {
		return "R";
	}	
}
