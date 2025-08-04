package com.example.myH2Database;

import com.example.myH2Database.entity.Customer;
import com.example.myH2Database.repository.ICustomer;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/customer")
public class TestController {

    private final ICustomer customerRepository;

    public TestController(ICustomer customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping()
    public List<Customer> Allcustomer()
    {
List<Customer> customers= (List<Customer>) customerRepository.findAll();
return customers;


    }

    @GetMapping("/{id}")
    public Customer customer(@PathVariable Integer id)
    {
        Optional<Customer> customer=  customerRepository.findById(id);
        return customer.get();


    }
}
