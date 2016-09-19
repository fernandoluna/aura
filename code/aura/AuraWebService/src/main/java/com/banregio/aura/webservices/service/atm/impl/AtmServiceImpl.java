package com.banregio.aura.webservices.service.atm.impl;

import com.banregio.aura.webservices.service.atm.AtmService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura ATM services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("atmService")
@Scope("prototype")
public class AtmServiceImpl implements AtmService {

  @Autowired
  private AuraTools auraTools;

}
