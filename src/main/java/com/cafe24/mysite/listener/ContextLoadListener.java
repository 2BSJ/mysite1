package com.cafe24.mysite.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextLoadListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce)  {
		
		
		
		System.out.println("Container Starts....");
	}
    public void contextDestroyed(ServletContextEvent sce)  { 
    
    }
	
}
