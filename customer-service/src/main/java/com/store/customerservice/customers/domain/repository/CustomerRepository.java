package com.store.customerservice.customers.domain.repository;

import com.store.customerservice.Regions.domain.entity.Region;
import com.store.customerservice.customers.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByNumberID(String numberID);

    public List<Customer> findByLastName(String lastName);

    public List<Customer> findByRegion(Region region);
}
