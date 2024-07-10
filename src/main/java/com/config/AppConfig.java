package com.config;


import com.service.CustomerImpl;
import com.service.CustomerService;
import com.service.HelloWord;
import com.service.HelloWordImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "helloBean")
    public HelloWord hellowWorld() {
        return new HelloWordImpl();
    }

    @Bean(name = "customerService")
    public CustomerService printCustomerDetails() {
        return new CustomerImpl();
    }

}
