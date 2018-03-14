package com.corey.repo;

/**
 * Created by haibinzheng on 2018-03-13.
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.corey.model.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
    List<Customers> findByLastName(String lastName);
}