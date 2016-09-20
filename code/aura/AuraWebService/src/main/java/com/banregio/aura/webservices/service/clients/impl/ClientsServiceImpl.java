package com.banregio.aura.webservices.service.clients.impl;

import com.banregio.aura.model.Client;
import com.banregio.aura.model.ClientWrapper;
import com.banregio.aura.model.Error;
import com.banregio.aura.webservices.service.clients.ClientsService;
import com.banregio.aura.webservices.tools.AuraTools;
import com.banregio.aura.webservices.utils.AuraUtilsMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura clients services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("clientService")
@Scope("prototype")
public class ClientsServiceImpl implements ClientsService {

  @Autowired
  private AuraTools auraTools;

  /**
   * Get client by RFC
   *
   * @param token contains the authentication token
   * @param rfc contains the client RFC
   * @return client wrapper
   */
  public ClientWrapper getClientByRFC(final String token, final String rfc){
    ClientWrapper clientWrapper = new ClientWrapper();

    //verify required fields
    Error error = auraTools.verifyRequiredFields(token, rfc);

    if(null != error
        && error.isSuccess()){

      //verify authentication token
      if(true){

        //get client by rfc API service
        Client client = null;
        if(true){
          //@client
          clientWrapper.setClient(client);

          //@error
          clientWrapper.setError(auraTools.fillErrorObject(AuraUtilsMessages.PROCESSED_SUCCESS_ERROR_CODE, AuraUtilsMessages.PROCESSED_SUCCESSFULLY_ERROR_MESSAGE, null, true));
        }else{
          //TODO --> client not found

          //@error
        }
      }else{
        //TODO --> authentication error

        //@error
      }
    }else{
      //@error
      clientWrapper.setError((null != error ? error : auraTools.fillErrorObject(AuraUtilsMessages.REQUIRED_FIELD_ERROR_CODE, AuraUtilsMessages.REQUIRED_FIELD_ERROR_MESSAGE.replace("{field}", "X-Auth-Token, RFC"), null, false)));
    }
    return clientWrapper;
  }

}
