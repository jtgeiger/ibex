package com.sibilantsolutions.ibex.controller;

import com.sibilantsolutions.ibex.dto.ClientAddressDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;

/**
 * Created by jt on 12/28/16.
 */

@RestController
@RequestMapping("/")
public class IpController {

    @RequestMapping(method = RequestMethod.GET)
    public ClientAddressDto getClientAddress(ServletRequest servletRequest) {
//TODO: Account for being behind a reverse proxy.  Detect IP from header if present.
        ClientAddressDto clientAddressDto = new ClientAddressDto();

        clientAddressDto.clientAddress = servletRequest.getRemoteAddr();
        clientAddressDto.clientPort = servletRequest.getRemotePort();

        return clientAddressDto;
    }

}
