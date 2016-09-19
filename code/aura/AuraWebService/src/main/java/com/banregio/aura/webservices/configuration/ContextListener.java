package com.banregio.aura.webservices.configuration;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;

/**
 * Configuration loader for log4j servlet
 *
 * @author fernandoluna
 * @since 2016-05-31
 * @version 1.0
 */

@WebListener("applicationContextListener")
public class ContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent event) {
    ServletContext context = event.getServletContext();
    PropertyConfigurator.configure(context.getRealPath("") + File.separator + context.getInitParameter("log4jConfigLocation"));
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {

  }
}
