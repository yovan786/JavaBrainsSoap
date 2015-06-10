package com.yovan.testmart.util;

public class InvalidInputException extends Exception {
	private static final long serialVersionUID = -1200948081482035839L;

	private String errorDetails;

	public InvalidInputException(String reason, String errorDetails) {
		super(reason);
		this.errorDetails = errorDetails;
	}

	public String getFaultInfo() {
		return errorDetails;
	}

}
