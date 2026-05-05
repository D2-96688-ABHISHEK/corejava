package com.sunbeam.q2;

@SuppressWarnings("serial")
public class DiameterNegativeException extends Exception {
	@Override
	public String getMessage() {
		return "Diameter is negative";
	}
}
