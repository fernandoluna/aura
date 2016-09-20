package com.banregio.aura.webservices.service.clients;

import com.banregio.aura.model.ClientWrapper;

/**
 * Aura clients services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

public interface ClientsService {

  /**
   * Get client by RFC
   *
   * @param token contains the authentication token
   * @param rfc contains the client RFC
   * @return client wrapper
   */
  public ClientWrapper getClientByRFC(String token, String rfc);

}
