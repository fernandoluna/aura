package com.banregio.aura.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Client wrapper model
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientWrapper implements Serializable, Cloneable {

  private static final long serialVersionUID = 1L;

  /**
   * Contains the error model
   */
  private Error error;

  /**
   * Contains the client model
   */
  private Client client;

  public Error getError() {
    return error;
  }
  public void setError(Error error) {
    this.error = error;
  }
  public Client getClient() {
    return client;
  }
  public void setClient(Client client) {
    this.client = client;
  }
}
