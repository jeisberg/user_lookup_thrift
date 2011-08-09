package com.lockerz.thrift.user_lookup.client;

import com.lockerz.thrift.user_lookup.gen.UserLookup;

public interface Client {
	
	public UserLookup lookupByUsername(String token, String username) throws ClientException;
	
	public UserLookup lookupById(String token, long id) throws ClientException;
}