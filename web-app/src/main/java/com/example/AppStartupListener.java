package com.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppStartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[AppStartupListener] contextInitialized: WAR started.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[AppStartupListener] contextDestroyed: WAR stopped.");
    }
}
