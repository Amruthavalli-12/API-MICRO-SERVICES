package com.example.week3b;

import com.example.week3b.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week3bApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                Week3bApplication.class,
                args
        );
    }

    @Bean
    public CommandLineRunner run(EmployeeService service) {

        return args -> {
            System.out.println(
                    service.getEmployeeDetails()
            );
        };
    }
}