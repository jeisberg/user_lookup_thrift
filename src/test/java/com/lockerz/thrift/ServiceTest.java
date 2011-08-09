package com.lockerz.thrift;

import org.apache.thrift.TException;
import com.lockerz.thrift.user_lookup.gen.UserLookup;
import org.springframework.context.ApplicationContext;
import com.lockerz.thrift.user_lookup.gen.UserLookupServiceException;
import com.lockerz.thrift.user_lookup.services.UserLookupServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    public static void main(String[] args) {
    	// get the context here
    	ApplicationContext context = new ClassPathXmlApplicationContext("user_lookup.xml"); 	
        // get the template service here
        UserLookupServiceImpl userLookupService = (UserLookupServiceImpl) context.getBean("userLookupService");
        // need this
        UserLookup userLookup = null;
        // test the service
        try { 
        	// get the user lookup
        	userLookup = userLookupService.lookupByUsername("sometoken", "jeisberg500@yahoo.com");
        	// output here
        	System.out.println(userLookup);
        	// get the user lookup
        	userLookup = userLookupService.lookupById("sometoken", userLookup.getId());
        	// run the service here
        	System.out.println(userLookup);
        // catch here
        } catch(UserLookupServiceException e) {
        	// output here
        	System.out.println(e.getMessage());
        	// output here
        	System.out.println(e.getErrors());
        	// print the stack
        	e.printStackTrace();
        } catch(TException t) {
        	// output here
        	System.out.println(t.getMessage());
        	// print the stack
        	t.printStackTrace();
        }
        // exit here
    	System.exit(0);
    }
}
