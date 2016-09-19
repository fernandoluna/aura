package com.banregio.aura.webservices.service.exchangerate.impl;

import com.banregio.aura.webservices.service.exchangerate.ExchangeRateService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura exchange rate services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("exchangeRateService")
@Scope("prototype")
public class ExchangeRateServiceImpl implements ExchangeRateService {

  @Autowired
  private AuraTools auraTools;

}
