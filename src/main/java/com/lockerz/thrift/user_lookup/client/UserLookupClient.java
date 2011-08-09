package com.lockerz.thrift.user_lookup.client;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.protocol.TBinaryProtocol;
import com.lockerz.thrift.user_lookup.server.Server;
import com.lockerz.thrift.user_lookup.gen.UserLookup;
import com.lockerz.thrift.user_lookup.gen.UserLookupService.Client;
import com.lockerz.thrift.user_lookup.gen.UserLookupServiceException;

public class UserLookupClient extends ClientImpl {

	// need this
	private static UserLookupClient instance = null;
	
	// constructor
	protected UserLookupClient() {
	}
	  
	// get the instance here
	public static UserLookupClient getInstance() {
		// sanity check
		if(instance == null) {
			// create the instance
	        instance = new UserLookupClient();
	    }
	    // return here
		return instance;
	}

	@Override
	public UserLookup lookupByUsername(String token, String username) throws ClientException {
		// need this
		TTransport transport = null;
		// try
		try {
			// create the transport here
			transport = new TSocket("localhost", Server.PORT);
			// create the protocol here
			TProtocol protocol = new TBinaryProtocol(transport);
			// get the client here
			Client client = new Client(protocol);
			// open the transport here
			transport.open();
			// do something here
			UserLookup userLookup = client.lookupByUsername(token, username);
			// close the transport here
			transport.close();
			// return here
			return userLookup;
		// catch here
		} catch (UserLookupServiceException e) {
			// throw a client exception
			throw new ClientException(e.getMessage(), e.getErrors());
		// close here
		} catch (TException t) {
			// create message
			String message = this.getClass().getName() + " -> " + t.getMessage();
			// throw a client exception
			throw new ClientException(message, null);
		// close here
		} finally {
			// sanity check
			if(transport != null && transport.isOpen()) {
				// close here
				transport.close();
			}
		}
	}
	
	@Override
	public UserLookup lookupById(String token, long id) throws ClientException {
		// need this
		TTransport transport = null;
		// try
		try {
			// create the transport here
			transport = new TSocket("localhost", Server.PORT);
			// create the protocol here
			TProtocol protocol = new TBinaryProtocol(transport);
			// get the client here
			Client client = new Client(protocol);
			// open the transport here
			transport.open();
			// do something here
			UserLookup userLookup = client.lookupById(token, id);
			// close the transport here
			transport.close();
			// return here
			return userLookup;
			// catch here
		} catch (UserLookupServiceException e) {
			// throw a client exception
			throw new ClientException(e.getMessage(), e.getErrors());
		// close here
		} catch (TException t) {
			// create message
			String message = this.getClass().getName() + " -> " + t.getMessage();
			// throw a client exception
			throw new ClientException(message, null);
		// close here
		} finally {
			// sanity check
			if(transport != null && transport.isOpen()) {
				// close here
				transport.close();
			}
		}
	}
}
