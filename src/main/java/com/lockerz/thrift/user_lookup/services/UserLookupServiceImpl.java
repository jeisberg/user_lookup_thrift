package com.lockerz.thrift.user_lookup.services;

import org.apache.thrift.TException;
import com.lockerz.thrift.user_lookup.gen.UserLookup;
import com.lockerz.thrift.user_lookup.dao.DaoException;
import com.lockerz.thrift.user_lookup.utilities.ExceptionHelper;
import com.lockerz.thrift.user_lookup.gen.UserLookupServiceException;

public class UserLookupServiceImpl extends ServiceImpl {

	// need these
	public static final int LOOKUP_BY_ID = 100;
	public static final int LOOKUP_BY_USERNAME = 150;
	
	// need these
	public static final double LOOKUP_FAILED = 100.01;
	public static final double LOOKUP_EMPTY = 100.51;
	
	@Override
	public UserLookup lookupByUsername(String token, String username) throws UserLookupServiceException, TException {
		// initialize tokens
		super.init(token, LOOKUP_BY_USERNAME);
		// try
		try {
			// slug here
			UserLookup row = dao.lookupByUsername(username);
			// sanity check
			if(row == null) {
				// create the message
				String message = "lookup by username [" + username + "] is empty";
				// create the exception
				throw ExceptionHelper.fatal(LOOKUP_EMPTY, message);
			}
			// return here
			return row;
		// catch and throw here
		} catch(DaoException e) {
			// create the message
			String message = "lookup by username [" + username + "] failed";
			// create the exception
			throw ExceptionHelper.fatal(LOOKUP_FAILED, message);
		}
	}

	@Override
	public UserLookup lookupById(String token, long id) throws UserLookupServiceException, TException {
		// initialize tokens
		super.init(token, LOOKUP_BY_ID);
		// try
		try {
			// slug here
			UserLookup row = dao.lookupById(id);
			// sanity check
			if(row == null) {
				// create the message
				String message = "lookup by id [" + id + "] is empty";
				// create the exception
				throw ExceptionHelper.fatal(LOOKUP_EMPTY, message);
			}
			// return here
			return row;
		// catch and throw here
		} catch(DaoException e) {
			// create the message
			String message = "lookup by id [" + id + "] failed";
			// create the exception
			throw ExceptionHelper.fatal(LOOKUP_FAILED, message);
		}
	}
}