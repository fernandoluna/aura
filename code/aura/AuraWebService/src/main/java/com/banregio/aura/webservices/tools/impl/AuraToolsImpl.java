package com.banregio.aura.webservices.tools.impl;

import com.banregio.aura.webservices.configuration.ConfigurationService;
import com.banregio.aura.webservices.tools.AuraTools;
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

  //metodo de llamar al WS API

}
