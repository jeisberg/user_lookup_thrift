package com.lockerz.thrift.user_lookup.auth;

import java.util.Map;

public class AuthenticatorException extends Exception {

	// need this
	private static final long serialVersionUID = 1L;

	// need this
	private Map<Double,String> errors;

	public AuthenticatorException() {
		// call parent
		super();
	}
	
	public AuthenticatorException(String message, Map<Double,String> errors) {
		// call parent
		super(message);
		// set the errors
		this.errors = errors;
	}
	
	public Map<Double,String> getErrors() {
		// return here
		return errors;
	}

	public void setErrors(Map<Double,String> errors) {
		// set here
		this.errors = errors;
	}
}
