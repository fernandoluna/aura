package com.banregio.aura.webservices.service.users.impl;

import com.banregio.aura.webservices.service.users.UsersService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura users services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("userService")
@Scope("prototype")
public class UsersServiceImpl implements UsersService {

  @Autowired
  private AuraTools auraTools;

}