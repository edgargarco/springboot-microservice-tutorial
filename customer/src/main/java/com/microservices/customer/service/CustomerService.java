package com.microservices.customer.service;


import com.microservices.customer.model.Customer;
import com.microservices.customer.repository.CustomerRepository;
import com.microservices.customer.request.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer customer = Customer.builder().firstName(customerRegistrationRequest.firstName()).
                lastName(customerRegistrationRequest.lastName()).email(customerRegistrationRequest.
                        email()).build();
        customerRepository.save(customer);


    }
}
