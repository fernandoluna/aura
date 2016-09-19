package com.banregio.aura.webservices.service.financialhealt.impl;

import com.banregio.aura.webservices.service.financialhealt.FinancialHealthService;
import com.banregio.aura.webservices.tools.AuraTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Aura financial health services
 *
 * @author fernandoluna
 * @since 2016-09-19
 * @version 1.0
 */

@Service("financialHealthService")
@Scope("prototype")
public class FinancialHealthServiceImpl implements FinancialHealthService {

  @Autowired
  private AuraTools auraTools;

}
