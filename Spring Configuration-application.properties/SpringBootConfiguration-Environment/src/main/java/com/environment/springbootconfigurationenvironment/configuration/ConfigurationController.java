package com.environment.springbootconfigurationenvironment.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationController {
    @Autowired
    private Environment environment;

    @GetMapping("/configure/{type}")
    public String propertiesValue(@PathVariable("type") Integer type) {
        if (type == 1) {
            return "From Environment: " + environment.getProperty("name.website.data") + " Information " + environment.getProperty("name.website.information");
        } else {
            return null;
        }
    }
}
