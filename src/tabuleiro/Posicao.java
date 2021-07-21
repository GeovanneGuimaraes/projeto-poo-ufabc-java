package tabuleiro;

public class Posicao {
	
	private int coluna;
	private int linha;
	
	//Construtor de Posicao
	public Posicao(int coluna, int linha) {
		this.coluna = coluna;
		this.linha = linha;
	}
	
	// Get e Set do atributo coluna
	public int getColuna() {
		return coluna;
	}
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	
	//Get e Set do atributo linha
	public int getLinha() {
		return linha;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	// Mostrar a linha e coluna
	public String toString() {
		return "Linha: " + linha + " - Coluna: " + coluna;
 	}
}
