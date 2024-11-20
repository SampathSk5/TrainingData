package com.hlag.exception;


public class ProductNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return this.getMessage();
	}

	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
