package com.example.myH2Database.repository;

import com.example.myH2Database.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomer extends CrudRepository<Customer, Integer> {


}
