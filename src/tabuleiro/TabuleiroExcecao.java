package tabuleiro;

public class TabuleiroExcecao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public TabuleiroExcecao(String message) {
		super(message);
	}
}
