package com.marcio.springsecuritybasicsec6.repository;

import com.marcio.springsecuritybasicsec6.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Account,Integer> {
    Account findByCustomerId(int customerId);
}
