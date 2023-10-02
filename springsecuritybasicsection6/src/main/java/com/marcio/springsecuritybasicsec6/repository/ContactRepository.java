package com.marcio.springsecuritybasicsec6.repository;

import com.marcio.springsecuritybasicsec6.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact,String> {
}
