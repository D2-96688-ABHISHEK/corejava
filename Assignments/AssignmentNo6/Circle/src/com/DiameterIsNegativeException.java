package com;

public class DiameterIsNegativeException extends Exception {
	private String message;
	
	public DiameterIsNegativeException() {
		
	}
	public DiameterIsNegativeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}
