package com.emma.customerservice;

import com.emma.customerservice.Entities.Customer;
import com.emma.customerservice.Repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@RefreshScope
@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null, "Achille", "contact.achille@free.bf"));
            customerRepository.save(new Customer(null, "Axel", "contact.axel@free.bf"));
            customerRepository.save(new Customer(null, "Antonio", "contact.antonio@free.bf"));
        };
    }

}
