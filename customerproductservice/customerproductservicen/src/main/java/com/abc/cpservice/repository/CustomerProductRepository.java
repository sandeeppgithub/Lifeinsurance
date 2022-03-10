package com.abc.cpservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.cpservice.entity.CustomerProductEntity;

@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProductEntity , Integer> {

	

}
