package com.franics.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "myFallback")
    public String myService(String serverNAME, String serverDO) {
        String url = "http://" + serverNAME + "/" + serverDO;
        System.out.println(url);
        return restTemplate.getForEntity(url, String.class).getBody();
    }

    public String myFallback(String serverNAME, String serverDO) {
        return serverNAME + "-" + serverDO + "这个请求ribbon处理失败了";
    }
}
