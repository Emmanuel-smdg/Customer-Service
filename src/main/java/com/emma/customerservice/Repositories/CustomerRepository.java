package com.emma.customerservice.Repositories;

import com.emma.customerservice.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
