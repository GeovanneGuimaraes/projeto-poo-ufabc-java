package aplicacao;

import java.util.Scanner;

import jogo_de_xadrez.Jogo;
import jogo_de_xadrez.JogoExcecao;
import jogo_de_xadrez.JogoPosicao;
import jogo_de_xadrez.PecaXadrez;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Jogo xadrez = new Jogo();
		
		// Testando o tabuleiro
		while (true) {
			try {
				//interfaceJogo.clearScreen();
				interfaceJogo.mostraTabuleiro(xadrez.getPecas());
				System.out.println("");
				System.out.print("Origem: ");
				JogoPosicao origem = interfaceJogo.lerJogoPosicao(teclado);
				System.out.println();
				System.out.print("Destino: ");
				JogoPosicao destino = interfaceJogo.lerJogoPosicao(teclado);
				PecaXadrez pecaCapturada = xadrez.moverPeca(origem, destino);
			} catch (JogoExcecao e) {
				System.out.println(e.getMessage());
				teclado.nextLine();
			}

		}

	}

}
