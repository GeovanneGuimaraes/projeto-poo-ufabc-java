package aplicacao;

import jogo_de_xadrez.PecaXadrez;

public class interfaceJogo {

	public static void mostraPeca(PecaXadrez peca) {
		// Verificar se há peça no tabuleiro, se nao tiver uma peça é colocada
		if (peca == null) {
			System.out.printf("[]");
		} else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}

	public static void mostraTabuleiro(PecaXadrez[][] pecas) {
		int x=0, y=0;
		for(x=0; x<8; x=x+1) {
			System.out.printf((8-x) + " ");
			for(y=0; y<8; y=y+1) {
				mostraPeca(pecas[x][y]);
			}
		}
		System.out.println("  a b c d e f g h");
	}
}
