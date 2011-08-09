package com.lockerz.thrift;

import com.lockerz.thrift.user_lookup.gen.UserLookup;
import org.springframework.context.ApplicationContext;
import com.lockerz.thrift.user_lookup.dao.DaoException;
import com.lockerz.thrift.user_lookup.dao.UserLookupDaoImpl;
import com.lockerz.thrift.user_lookup.services.UserLookupServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

    public static void main(String[] args) {
    	// get the context here
    	ApplicationContext context = new ClassPathXmlApplicationContext("user_lookup.xml"); 	
        // get the template service here
        UserLookupServiceImpl userLookupService = (UserLookupServiceImpl) context.getBean("userLookupService");
        // get the template data here
        UserLookupDaoImpl userDao = (UserLookupDaoImpl) userLookupService.getDao();
        // slug
        UserLookup userLookup = null;
        // try
        try {
        	// get the template
        	userLookup = userDao.lookupByUsername("jeisberg500@yahoo.com");
        	// out put here
        	System.out.println("by username: " + userLookup);
        	// sanity check
        	if(userLookup != null) {
        		// get the template
            	userLookup = userDao.lookupById(userLookup.getId());
            	// out put here
            	System.out.println("by id: " + userLookup);
        	}
        	// exit here
        	System.exit(0);
        // output here
        } catch(DaoException e) {
        	// output here
        	System.out.println(e.getMessage());
        	// print the stack
        	e.printStackTrace();
        }
    }
}
