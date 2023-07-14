package net.arihant.springboot.repository;

import net.arihant.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository <Customer, Long>{
    //all CRUD database methods
}