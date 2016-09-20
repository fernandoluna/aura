package com.banregio.aura.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Client model
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client implements Serializable, Cloneable {

  private static final long serialVersionUID = 1L;

  /**
   * Contains the client first name
   */
  private String firstName;

  /**
   * Contains the client second name
   */
  private String secondName;

  /**
   * Contains the client rfc
   */
  private String rfc;

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getSecondName() {
    return secondName;
  }
  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
}
