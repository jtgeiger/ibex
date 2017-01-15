package com.sibilantsolutions.ibex.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jt on 12/28/16.
 */
public class ClientAddressDto {

    public String clientAddress;
    public int clientPort;
    final public Map<String, String> requestHeaders = new HashMap<>();

}
