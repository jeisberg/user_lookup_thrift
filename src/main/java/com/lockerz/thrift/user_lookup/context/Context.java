package com.lockerz.thrift.user_lookup.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {
	
	// need this
	private static final ApplicationContext context;
    
    static {
    	// get the context here and go
        context = new ClassPathXmlApplicationContext("user_lookup.xml");
    }
    
    // get the context here
    public static ApplicationContext getContext() {
        // return here
    	return context;
    }
}