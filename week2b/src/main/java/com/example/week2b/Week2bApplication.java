package com.example.week2b;

import com.example.week2b.model.Product;
import com.example.week2b.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week2bApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                Week2bApplication.class,
                args
        );
    }

    @Bean
    public CommandLineRunner demo(ProductRepository repository) {

        return args -> {

            System.out.println(
                    "--- Initializing H2 Database Schema ---"
            );

            repository.createTable();

            System.out.println(
                    "--- Inserting Sample Product Records ---"
            );

            repository.save(
                    new Product(
                            101L,
                            "MacBook Pro",
                            129999.00
                    )
            );

            repository.save(
                    new Product(
                            102L,
                            "Mechanical Keyboard",
                            4500.00
                    )
            );

            repository.save(
                    new Product(
                            103L,
                            "Wireless Mouse",
                            1800.00
                    )
            );

            System.out.println(
                    "--- Querying Records from Database ---"
            );

            List<Product> products = repository.findAll();

            for (Product p : products) {
                System.out.println(p.toString());
            }
        };
    }
}