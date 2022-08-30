package com.aspect.springbootaop;

import com.aspect.springbootaop.model.Employee;
import com.aspect.springbootaop.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAopApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext=SpringApplication.run(SpringBootAopApplication.class, args);
        EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
        employeeService.addEmployee(new Employee(100L,"Lavanya","Moyya","lavanyamoyya3@gmail.com"));
        employeeService.getEmployeeById(100L);
        employeeService.getAllEmployees();

    }

}
