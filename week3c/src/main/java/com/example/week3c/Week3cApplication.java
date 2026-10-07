package com.example.week3c;

import com.example.week3c.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week3cApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3cApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeService service) {
        return args -> {
            service.logDetails();
        };
    }
}