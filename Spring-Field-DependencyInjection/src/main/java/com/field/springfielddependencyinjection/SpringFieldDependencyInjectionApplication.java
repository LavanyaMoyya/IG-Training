package com.field.springfielddependencyinjection;

import com.field.springfielddependencyinjection.component.FieldBasedInjection;
import com.field.springfielddependencyinjection.config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFieldDependencyInjectionApplication {

	public static void main(String[] args) {
ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection fieldBasedInjection=applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("Twitter Sending msg... ");
	}

}
