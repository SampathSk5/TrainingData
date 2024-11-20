package com.hlag.exception;


public class InvalidDataException extends Exception {

	@Override
	public String toString() {
		return this.getMessage();
	}

	public InvalidDataException(String msg) {
		super(msg);
	}

}
