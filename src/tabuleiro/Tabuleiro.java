package tabuleiro;

public class Tabuleiro {
	
	private int colunas;
	private int linhas;
	
	//Atributo matriz de pecas
	private Peca[][] pecas;
	
	//Construtor de Tabuleiro
	public Tabuleiro(int linhas, int colunas) {
		this.colunas = colunas;
		this.linhas = linhas;
		pecas = new Peca[linhas][colunas];
	}
	
	//Retorna a peça no tabuleiro
	public Peca peca(int linha, int coluna) {
		return this.pecas[linha][coluna];
	}
	
	//Retorna a posição da peça no tabuleiro
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	// Get e Set do atributo coluna
	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	//Set e Get do atributo linha
	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	
	
	
}
