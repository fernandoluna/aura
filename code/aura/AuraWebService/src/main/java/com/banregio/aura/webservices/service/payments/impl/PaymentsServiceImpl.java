package com.banregio.aura.webservices.service.payments.impl;

import com.banregio.aura.webservices.service.payments.PaymentsService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura payments services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("paymentsService")
@Scope("prototype")
public class PaymentsServiceImpl implements PaymentsService {

  @Autowired
  private AuraTools auraTools;

}