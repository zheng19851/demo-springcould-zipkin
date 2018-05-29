package com.runssnail.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://localhost:8988/hi?name=" + name, String.class);
    }
}
