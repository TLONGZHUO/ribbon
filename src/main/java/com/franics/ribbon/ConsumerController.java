package com.franics.ribbon;

import com.franics.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class ConsumerController {

    @Autowired
    ComputeService computeService;

    @GetMapping(value = "/{serverNAME}/{serverDO}")
    public String add(@PathVariable("serverNAME") String serverNAME,
                      @PathVariable("serverDO") String serverDO) {
        return computeService.myService(serverNAME,serverDO);
    }
}