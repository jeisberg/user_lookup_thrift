package com.lockerz.thrift.user_lookup.dao;

import com.lockerz.thrift.user_lookup.gen.UserLookup;

public interface Dao {
	
	public UserLookup lookupByUsername(String username) throws DaoException;
	
	public UserLookup lookupById(long id) throws DaoException;
}