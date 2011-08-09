package com.lockerz.thrift.user_lookup.services;

import com.lockerz.thrift.user_lookup.dao.DaoImpl;
import com.lockerz.thrift.user_lookup.context.Context;
import com.lockerz.thrift.user_lookup.gen.UserLookupService;
import com.lockerz.thrift.user_lookup.auth.AuthenticatorImpl;
import com.lockerz.thrift.user_lookup.auth.AuthenticatorException;
import com.lockerz.thrift.user_lookup.gen.UserLookupServiceException;

abstract class ServiceImpl implements UserLookupService.Iface {
	
	// need this
	private  AuthenticatorImpl authenticator;
	
	// need these
	protected DaoImpl dao;

	public void setDao(DaoImpl dao) {
		// set the access here
		this.dao = dao;
	}
	
	public DaoImpl getDao() {
		// return here
		return dao;
	}
	
	public void setAuthenticator(AuthenticatorImpl authenticator) {
		// set the access here
		this.authenticator = authenticator;
	}
	
	public void init(String token, int serviceId) throws UserLookupServiceException {
		// try
		try {
			// set the data here
			setAuthenticator( (AuthenticatorImpl) Context.getContext().getBean("userLookupAuthenticator") );
			// authenticate here
			authenticator.authenticate(token, serviceId);
			// set the data here
			setDao( (DaoImpl) Context.getContext().getBean("userLookupDao") );
		// catch here
		} catch(AuthenticatorException e) {
			// need this
			throw new UserLookupServiceException(e.getMessage(), e.getErrors());
		}
	}
}
