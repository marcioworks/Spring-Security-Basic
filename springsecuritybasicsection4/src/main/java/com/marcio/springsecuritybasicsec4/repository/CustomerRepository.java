package com.marcio.springsecuritybasicsec4.repository;

import com.marcio.springsecuritybasicsec4.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByEmail(String email);
}
