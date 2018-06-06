package com.runssnail.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
/**
 * @author zhengwei
 */
public class ServiceProviderApplication {

    private static final Logger LOG = Logger.getLogger(ServiceProviderApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderApplication.class, args);
    }

    @RequestMapping("/hi")
    public String callHi(@RequestParam String name) {
        LOG.log(Level.INFO, "calling trace service-provider");
        return "hi" + name;
    }

//    @Bean
//    public AlwaysSampler defaultSampler() {
//        return new AlwaysSampler();
//    }
}
