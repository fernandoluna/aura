package com.banregio.aura.webservices.service.accounts.impl;

import com.banregio.aura.webservices.service.accounts.AccountsService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura accounts services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("accountsService")
@Scope("prototype")
public class AccountsServiceImpl implements AccountsService {

  @Autowired
  private AuraTools auraTools;

  //servicio agregar cuenta
  // logica agregar
  // y mandar llamar al ws del API
}
