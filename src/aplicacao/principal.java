package aplicacao;

import jogo_de_xadrez.Jogo;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class Principal {

	public static void main(String[] args) {
		
		//Testando o tabuleiro
		Jogo xadrez = new Jogo();
		interfaceJogo.mostraTabuleiro(xadrez.getPecas());

	}
	
	

}
