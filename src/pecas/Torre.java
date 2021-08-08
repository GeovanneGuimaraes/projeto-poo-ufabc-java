package pecas;

import jogo_de_xadrez.CoresPecas;
import jogo_de_xadrez.PecaXadrez;
import tabuleiro.Tabuleiro;

public class Torre extends PecaXadrez{
	
	//Construtor de Torre
	public Torre(Tabuleiro tabuleiro, CoresPecas cor) {
		super(tabuleiro, cor);
	}
	
	//Retorna "T" como torre no tabuleiro
	public String toString() {
		return "T";
	}
	
	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] auxiliar = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return auxiliar;
	}
}
