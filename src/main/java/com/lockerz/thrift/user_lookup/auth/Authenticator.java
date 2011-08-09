package com.lockerz.thrift.user_lookup.auth;

public interface Authenticator {
	
	public void authenticate(String token, int serviceId) throws AuthenticatorException;
}
