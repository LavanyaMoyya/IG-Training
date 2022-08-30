package com.properties.springbootconfigurationproperties.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
@org.springframework.boot.context.properties.ConfigurationProperties("name.website")
public class ConfigurationClass {
    private String data;
    private String information;

    public void setData(String data) {
        this.data = data;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getData() {
        return data;
    }

    public String getInformation() {
        return information;
    }
}

