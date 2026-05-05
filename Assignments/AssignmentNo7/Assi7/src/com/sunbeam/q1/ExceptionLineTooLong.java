package com.sunbeam.q1;

@SuppressWarnings("serial")
public class ExceptionLineTooLong extends Exception {
	private String exceptionMsg;
	
	public ExceptionLineTooLong(String msg) {
		this.setExceptionMsg(msg);
	}
	
	@Override
	public String getMessage() {
		return "Input String is too long";
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}

