package com.banregio.aura.webservices.persistence.clients.jdbc;

import com.banregio.aura.persistence.storedProcedure.clients.GetClientsStoredProcedure;
import com.banregio.aura.webservices.persistence.clients.ClientsDao;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Aura clients DAO
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

public class ClientsDaoJdbc implements ClientsDao {

  private GetClientsStoredProcedure getClientsStoredProcedure;

  private JdbcTemplate jdbcTemplate;

  private static final Logger logger = Logger.getLogger(ClientsDaoJdbc.class);

  public ClientsDaoJdbc(DataSource dataSource){
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    this.getClientsStoredProcedure = new GetClientsStoredProcedure(jdbcTemplate);
  }



}
