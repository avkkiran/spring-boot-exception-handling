package com.exception;

public class EmployeeServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public EmployeeServiceException() {
		super();
	}
	
	public EmployeeServiceException(String message) {
		super(message);
	}
}
