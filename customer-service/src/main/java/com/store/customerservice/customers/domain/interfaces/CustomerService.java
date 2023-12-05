package com.store.customerservice.customers.domain.interfaces;

import com.store.customerservice.Regions.domain.entity.Region;
import com.store.customerservice.customers.domain.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findCustomerAll();

    public List<Customer> findCustomersByRegion(Region region);

    public Customer createCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public Customer deleteCustomer(Customer customer);

    public Customer getCustomer(Long id);
}
