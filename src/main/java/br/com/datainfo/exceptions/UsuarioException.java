package br.com.datainfo.exceptions;

public class UsuarioException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UsuarioException(String message) {
		super(message);
	}	
}
