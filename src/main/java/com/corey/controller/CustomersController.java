package com.corey.controller;

/**
 * Created by haibinzheng on 2018-03-13.
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.corey.message.CustomersResponse;
import com.corey.model.Customers;
import com.corey.repo.CustomersRepository;

@RestController
public class CustomersController {

    @Autowired
    CustomersRepository repository;

    @RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
    public void postCustomer(@RequestBody Customers customer) {

        repository.save(new Customers(customer.getFirstName(), customer.getLastName()));
    }

    @RequestMapping("/findall")
    public CustomersResponse findAll() {

        Iterable<Customers> customers = repository.findAll();

        return new CustomersResponse("Done", customers);
    }

    @RequestMapping("/customer/{id}")
    public CustomersResponse findCustomerById(@PathVariable("id") long id) {

        Customers customer = repository.findOne(id);

        return new CustomersResponse("Done", customer);
    }

    @RequestMapping("/findbylastname")
    public CustomersResponse findByLastName(@RequestParam("lastName") String lastName) {

        List<Customers> customers = repository.findByLastName(lastName);

        return new CustomersResponse("Done", customers);
    }
}