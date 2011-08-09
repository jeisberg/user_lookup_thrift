package com.lockerz.thrift;

import com.lockerz.thrift.user_lookup.gen.UserLookup;
import com.lockerz.thrift.user_lookup.client.ClientException;
import com.lockerz.thrift.user_lookup.client.UserLookupClient;

public class TestClient {

	private void start(){
		// try
		try {
			// need this
			String token = "sometoken";
			// need this
			String username = "jeisberg500@yahoo.com";
			// get the instance and go
			UserLookup userLookup = UserLookupClient.getInstance().lookupByUsername(token, username);
			// output here
			System.out.println("username: " + userLookup);
			// sanity check
			if(userLookup.getId() > 0) {
				// get the instance and go
				userLookup = UserLookupClient.getInstance().lookupById(token, userLookup.getId());
				// output here
				System.out.println("id: " + userLookup);
			}
		// catch here
		} catch (ClientException e) {
			// print here
			System.out.println(e.getMessage());
			// print here
			System.out.println(e.getErrors());
			// print here
			e.printStackTrace();
		}
		// exit here
    	System.exit(0);
	}

	public static void main(String[] args) {
		// create the client here
		TestClient test = new TestClient();
		// start
		test.start();
	}	
}
