package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.exceptions.CustomerDeleteException;
import com.itschool.library.models.dtos.RequestCustomerDTO;
import com.itschool.library.models.dtos.ResponseCustomerDTO;
import com.itschool.library.models.entities.Customer;
import com.itschool.library.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);
    private final CustomerRepository customerRepository;
    private final ObjectMapper objectMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, ObjectMapper objectMapper) {
        this.customerRepository = customerRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public ResponseCustomerDTO createCustomer(RequestCustomerDTO requestCustomerDTO) {
        Customer customerEntity = objectMapper.convertValue(requestCustomerDTO, Customer.class);
        Customer customerEntityResponse = customerRepository.save(customerEntity);
        log.info("Customer with id {} was saved ", customerEntityResponse.getId());

        return objectMapper.convertValue(customerEntityResponse, ResponseCustomerDTO.class);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.findById(id).orElseThrow(() -> new CustomerDeleteException("Customer with id " + id + " not found "));
        customerRepository.deleteById(id);
        log.info("Customer with id {} was deleted", id);
    }
}