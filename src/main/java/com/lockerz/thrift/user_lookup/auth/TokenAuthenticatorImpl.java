package com.lockerz.thrift.user_lookup.auth;

import com.lockerz.thrift.user_lookup.utilities.ExceptionHelper;

public class TokenAuthenticatorImpl extends AuthenticatorImpl {

	// need this
	private String token = null;
	
	// need this
	public static final double UNAUTHENTICATED = 1.01;
	
	// create the setter
	public void setToken(String token) {
		// set the token here
		this.token = token;
	}
	
	public void authenticate(String token, int serviceId) throws AuthenticatorException {
		// return here
		if(token == null || !token.equals(this.token)) {
			// create the message
			String message = "Token [" + token + "] does not have access to service [" + serviceId + "]";
			// create the exception
			throw ExceptionHelper.fatal(UNAUTHENTICATED, message, true);
		}
	}
}