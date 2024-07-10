package com.boa.Spring_Core_Demo;

import com.boa.model.CustomerModel;
import com.config.AppConfig;
import com.service.CustomerService;
import com.service.HelloWord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SpringCoreDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreDemoApplication.class, args);
        System.out.println("My First Spring boot project***");
        ApplicationContext context =  SpringApplication.run(AppConfig.class, args);
        HelloWord helloBean = (HelloWord) context.getBean("helloBean");
        System.out.println(helloBean.printDetails("BOA Microservices Session******"));

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        getData(customerService.printCustomerDetails());
    }

    private static void getData(ArrayList<CustomerModel> data) {
        data.stream().forEach(elt -> {
            System.out.println(elt.getCustomerID());
            System.out.println(elt.getCustomerName());
            System.out.println(elt.getCustomerAddress());
        });
    }

}
