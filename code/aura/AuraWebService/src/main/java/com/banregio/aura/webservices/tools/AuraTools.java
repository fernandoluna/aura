package com.banregio.aura.webservices.tools;

import com.banregio.aura.model.Error;

/**
 * Aura tools layer for services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

public interface AuraTools {

  /**
   * Verify the required fields
   *
   * @param token contains the authentication token
   * @param rfc contains the client RFC
   * @return error
   */
  public Error verifyRequiredFields(String token, String rfc);

  /**
   * Fill Error object
   *
   * @param code Identify a code generated in the transaction flow
   * @param message Identify the message resulted in the transaction flow
   * @param exception Identify the exception generated in the transaction flow, null value when the transaction is clean
   * @param success Identify the successfully for the transaction
   * @return error
   */
  public Error fillErrorObject(String code, String message, String exception, boolean success);

}
