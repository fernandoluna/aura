package com.banregio.aura.webservices.tools.impl;

import com.banregio.aura.model.Error;
import com.banregio.aura.utils.AuraUtilsMapper;
import com.banregio.aura.webservices.configuration.ConfigurationService;
import com.banregio.aura.webservices.tools.AuraTools;
import com.banregio.aura.webservices.utils.AuraUtilsMessages;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura tools layer for services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("auraTools")
@Scope("prototype")
public class AuraToolsImpl implements AuraTools {

  @Autowired
  private ConfigurationService configurationService;

  private static final Logger logger = Logger.getLogger(AuraToolsImpl.class);

  /**
   * Verify the required fields
   *
   * @param token contains the authentication token
   * @param rfc contains the client RFC
   * @return error
   */
  public Error verifyRequiredFields(final String token, final String rfc){
    Error error = null;
    try{
      //@token
      if(isValidChain(token)){

        //@rfc
        if(isValidChain(rfc)){
          error = fillErrorObject(null, null, null, true);
        }else{
          error = fillErrorObject(AuraUtilsMessages.REQUIRED_FIELD_ERROR_CODE, AuraUtilsMessages.REQUIRED_FIELD_ERROR_MESSAGE.replace("{field}", "RFC"), null, false);
        }
      }else{
        error = fillErrorObject(AuraUtilsMessages.REQUIRED_FIELD_ERROR_CODE, AuraUtilsMessages.REQUIRED_FIELD_ERROR_MESSAGE.replace("{field}", "X-Auth-Token"), null, false);
      }
    }catch (Exception ex){
      logger.error(AuraUtilsMessages.ERROR_VERIFYING_REQUIRED_FIELDS + AuraUtilsMapper.MESSAGE_ERROR_LOCALIZED + ex.getLocalizedMessage() + AuraUtilsMapper.MESSAGE_ERROR_MESSAGE + ex.getMessage());
    }
    return error;
  }

  /**
   * Verify if chain is not empty
   *
   * @param chain contains the object value
   * @return is valid object
   */
  private boolean isValidChain(final String chain){
    if(null != chain
        && !chain.isEmpty()){
      return true;
    }else{
      return false;
    }
  }

  /**
   * Fill Error object
   *
   * @param code Identify a code generated in the transaction flow
   * @param message Identify the message resulted in the transaction flow
   * @param exception Identify the exception generated in the transaction flow, null value when the transaction is clean
   * @param success Identify the successfully for the transaction
   * @return error
   */
  public Error fillErrorObject(final String code, final String message, final String exception, final boolean success){
    Error error = new Error();
    try{

      //@code
      error.setCode(code);
      //@message
      error.setMessage(message);
      //@exception
      error.setException(exception);
      //@success
      error.setSuccess(success);
    }catch (Exception ex){
      logger.error(AuraUtilsMessages.ERROR_SETTING_ERROR_OBJECT + AuraUtilsMapper.MESSAGE_ERROR_LOCALIZED + ex.getLocalizedMessage() + AuraUtilsMapper.MESSAGE_ERROR_MESSAGE + ex.getMessage());
    }
    return error;
  }

}
