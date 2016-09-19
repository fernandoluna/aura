package com.banregio.aura.webservices.service.security.impl;

import com.banregio.aura.webservices.service.security.SecurityService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura security services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("securityService")
@Scope("prototype")
public class SecurityServiceImpl implements SecurityService {

  @Autowired
  private AuraTools auraTools;

}