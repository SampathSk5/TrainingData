package com.hlag.exception;

public class InvalidNameException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return this.getMessage();
	}

	public InvalidNameException(String msg) {
		super(msg);
	}

}
