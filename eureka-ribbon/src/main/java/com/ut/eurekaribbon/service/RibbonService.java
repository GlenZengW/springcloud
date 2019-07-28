package com.ut.eurekaribbon.service;

import org.apache.commons.lang.math.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String getClientHi() {
        String id = String.valueOf(new Random().nextInt());

        return restTemplate.getForObject("http://eureka-client/hi/"+id, String.class);
    }
}
