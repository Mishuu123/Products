package com.Product.Exception;

public class NoDataFoundException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -5126758215931235865L;

	public NoDataFoundException() {
		super("No data found");
	}
}
