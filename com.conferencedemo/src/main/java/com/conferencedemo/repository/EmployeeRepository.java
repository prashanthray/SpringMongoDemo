package com.conferencedemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.conferencedemo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
}
