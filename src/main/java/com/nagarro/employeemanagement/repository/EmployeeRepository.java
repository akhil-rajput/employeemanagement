package com.nagarro.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.employeemanagement.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}