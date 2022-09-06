package com.logging.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class SpringBootLoggingApplication {
Logger log= LoggerFactory.getLogger(SpringBootLoggingApplication.class);
    @GetMapping("/test/{name}")
    public String greeting(@PathVariable String name){
        log.debug("Request{}",name);
        if (name.equalsIgnoreCase(("test"))) {

            throw new RuntimeException("oops! Exception raised...");
        }
        String response= "Hi"+name+"Welcome to home";
        log.debug("Response{}",response);
        return response;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoggingApplication.class, args);
    }

}