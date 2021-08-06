package jogo_de_xadrez;

import tabuleiro.Posicao;

public class JogoPosicao {
	
	private int linha;
	private char coluna;
	
	public JogoPosicao(char coluna, int linha) {
		if((linha < 1) || (linha > 8) || coluna < 'a' || coluna > 'h') {
			throw new JogoExcecao("Erro: Coluna ou Linha precisam estar entre 1-8 e a-h");
		}
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//Get e Set de linha
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	//Get e Set de cooluna
	public char getColuna() {
		return coluna;
	}

	public void setColuna(char coluna) {
		this.coluna = coluna;
	}
	
	//Método responsável pela conversão das coordendas do Tabuleiro
	public Posicao irPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	public JogoPosicao voltarPosicao(Posicao posicao) {
		return new JogoPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	public String toString() {
		return "( " + coluna + ", " + linha + ")";
	}
	
}
