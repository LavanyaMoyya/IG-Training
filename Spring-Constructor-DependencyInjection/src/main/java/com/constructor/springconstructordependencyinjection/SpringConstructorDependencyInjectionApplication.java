package com.constructor.springconstructordependencyinjection;

import com.constructor.springconstructordependencyinjection.component.ConstructorBasedInjection;
import com.constructor.springconstructordependencyinjection.config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringConstructorDependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection constructorBasedInjection=applicationContext.getBean(ConstructorBasedInjection.class);
        constructorBasedInjection.processMsg("Twitter Sending msg...");
    }

}
