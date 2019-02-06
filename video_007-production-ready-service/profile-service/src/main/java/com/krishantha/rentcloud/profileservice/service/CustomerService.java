package com.krishantha.rentcloud.profileservice.service;

import com.krishantha.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
