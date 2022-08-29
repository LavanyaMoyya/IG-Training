package com.setter.springsetterdependencyinjection;

import com.setter.springsetterdependencyinjection.component.SetterBasedInjection;
import com.setter.springsetterdependencyinjection.config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringSetterDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SetterBasedInjection setterBasedInjection=applicationContext.getBean(SetterBasedInjection.class);
        setterBasedInjection.processMsg("Twitter msg Sending...");

    }

}
