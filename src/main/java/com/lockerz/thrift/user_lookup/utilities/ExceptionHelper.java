package com.lockerz.thrift.user_lookup.utilities;

import java.util.HashMap;
import com.lockerz.thrift.user_lookup.auth.AuthenticatorException;
import com.lockerz.thrift.user_lookup.gen.UserLookupServiceException;

public class ExceptionHelper {
	
	public static UserLookupServiceException fatal(double code, String message) {
		// create the error
		HashMap<Double, String> errors = new HashMap<Double, String>(1);
		// put the error
		errors.put(new Double(code), message);
		// throw the error here
		return new UserLookupServiceException(message, errors);
	}
	
	public static AuthenticatorException fatal(double code, String message, boolean signature) {
		// create the error
		HashMap<Double, String> errors = new HashMap<Double, String>(1);
		// put the error
		errors.put(new Double(code), message);
		// throw the error here
		return new AuthenticatorException(message, errors);
	}
}