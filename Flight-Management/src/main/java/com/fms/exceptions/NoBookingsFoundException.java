package com.fms.exceptions;

public class NoBookingsFoundException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoBookingsFoundException (String message) {
		super(message);

	}
}
