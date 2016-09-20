package com.banregio.aura.webservices.controller.client;

import com.banregio.aura.model.ClientWrapper;
import com.banregio.aura.webservices.service.clients.ClientsService;
import com.banregio.aura.webservices.utils.AuraUtilsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller("clientController")
@Scope("prototype")
@RequestMapping("/client")
public class ClientController {

  @Autowired
  private ClientsService clientsService;

  @RequestMapping(value = "/{rfc}", method = RequestMethod.GET)
  public @ResponseBody ClientWrapper getClientByRFC(@RequestHeader("x-auth-token") String token, @PathVariable("rfc") String rfc, HttpServletResponse httpServletResponse){

    ClientWrapper clientWrapper = clientsService.getClientByRFC(token, rfc);

    //verify error transaction
    if(!clientWrapper.getError().isSuccess()){
      httpServletResponse.setStatus(AuraUtilsMapper.HTTP_ERROR_CODE);
    }

    return clientWrapper;
  }
}
