package com.example.week3e;

import com.example.week3e.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week3eApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3eApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeService service) {
        return args -> {
            service.logDetails();
        };
    }
}