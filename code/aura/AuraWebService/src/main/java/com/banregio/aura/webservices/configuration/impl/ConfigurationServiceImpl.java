package com.banregio.aura.webservices.configuration.impl;

import com.banregio.aura.webservices.configuration.ConfigurationService;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Properties;

/**
 * Configuration service provide of metadata to connect the BIS with our application
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("configurationService")
@Scope("singleton")
public class ConfigurationServiceImpl implements ConfigurationService {

  private static final Logger logger = Logger.getLogger(ConfigurationServiceImpl.class);

  private static final String PROPERTIES_FILE_NAME = "configMapper.properties";

  //external path
  private String externalPath;

  /**
   * Constructor of class Configuration Service
   */
  public ConfigurationServiceImpl() {
    loadConfiguration();
  }

  /**
   * Method load configuration from properties file
   */
  private void loadConfiguration() {
    Properties properties = new Properties();
    try{
      properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(PROPERTIES_FILE_NAME));
    }catch(Exception ex){
      throw new RuntimeException(".:: Error loading properties file " + PROPERTIES_FILE_NAME, ex);
    }

    //@externalPath
    this.externalPath = properties.getProperty("configuration.external.path").trim();

    if(null != externalPath
        && !externalPath.isEmpty()) {

      properties = new Properties();
      try {
        properties.load(new FileInputStream(new File(externalPath)));
      } catch (Exception ex) {
        throw new RuntimeException(".:: Error loading properties file: " + externalPath, ex);
      }
    }
  }
}
