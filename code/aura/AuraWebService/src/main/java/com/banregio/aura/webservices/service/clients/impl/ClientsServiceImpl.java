package com.banregio.aura.webservices.service.clients.impl;

import com.banregio.aura.webservices.service.clients.ClientsService;
import com.banregio.aura.webservices.tools.AuraTools;
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

}
