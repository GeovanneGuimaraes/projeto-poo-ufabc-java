package tabuleiro;

public class Tabuleiro {
	
	private int colunas;
	private int linhas;
	
	//Atributo matriz de pecas
	private Peca[][] pecas;
	
	//Construtor de Tabuleiro
	public Tabuleiro(int linhas, int colunas) {
		if(colunas < 1 || linhas < 1) {
			throw new TabuleiroExcecao("Erro: Linha ou Coluna nao podem ser vazios");
		}
		this.colunas = colunas;
		this.linhas = linhas;
		pecas = new Peca[linhas][colunas];
	}
	
	//Retorna a peca no tabuleiro
	public Peca peca(int linha, int coluna) {
		if(!temPosicao(linha, coluna)) {
			throw new TabuleiroExcecao("Erro: Nao existe a posicao desejada no tabuleiro");
		}
		return this.pecas[linha][coluna];
	}
	
	//Retorna a posição da pe�a no tabuleiro
	public Peca peca(Posicao posicao) {
		if(!temPosicao(posicao)) {
			throw new TabuleiroExcecao("Erro: Nao existe a posicao desejada no tabuleiro");
		}
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
	
	//Metodo que insere a peça no tabuleiro
	public void colocaPeca(Peca peca, Posicao posicao) {
		if (temPeca(posicao)) {
			throw new TabuleiroExcecao("Erro: Ja existe uma peca nesta posicao");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	//Validação se foi inserido uma possivel valida
	public boolean temPosicao(int linha, int coluna) {
		boolean condicao = true;
		if((linha >= 0) && (linha < linhas) && (coluna >= 0) && (coluna < colunas)) {
			condicao = true;
		}else {
			condicao = false;
		}
		return condicao;
	}
	
	//Inserção das linhas/colunas para verificação
	public boolean temPosicao(Posicao posicao) {
		return temPosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	//Verifica se existe uma peça nessa posição
	public boolean temPeca(Posicao posicao) {
		if(!temPosicao(posicao)) {
			throw new TabuleiroExcecao("Erro: Nao existe a posicao desejada no tabuleiro");
		}
		
		boolean condicao = true;
		if(peca(posicao) != null) {
			condicao = true;
		}else {
			condicao = false;
		}
		return condicao;
	}
	
	//Remover peça
	public Peca removerPeca(Posicao posicao) {
		if(!temPosicao(posicao)) {
			throw new TabuleiroExcecao("Erro: Nao existe a posicao desejada no tabuleiro");
		}
		if (peca(posicao) == null) {
			return null;
		}
		Peca auxiliar = peca(posicao);
		auxiliar.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return auxiliar;
	}
	
	
	
	
	
}
