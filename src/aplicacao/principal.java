package aplicacao;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class principal {

	public static void main(String[] args) {
		
		//Testando a classe Posicao
		Posicao posicao = new Posicao(2,  6);
		System.out.println(posicao);
		
		//Testando a classe Tabuleiro
		Tabuleiro tabuleiro = new Tabuleiro(8, 8);

	}

}
