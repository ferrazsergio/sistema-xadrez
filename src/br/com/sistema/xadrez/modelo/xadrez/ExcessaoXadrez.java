package br.com.sistema.xadrez.modelo.xadrez;

public class ExcessaoXadrez extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ExcessaoXadrez(String msg) {
		super(msg);
	}

}