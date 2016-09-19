package com.banregio.aura.webservices.service.notifications.impl;

import com.banregio.aura.webservices.service.notifications.NotificationsService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura notifications services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("notificationsService")
@Scope("prototype")
public class NotificationsServiceImpl implements NotificationsService {

  @Autowired
  private AuraTools auraTools;
}
