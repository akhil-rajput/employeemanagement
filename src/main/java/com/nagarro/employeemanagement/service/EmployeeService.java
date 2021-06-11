package com.nagarro.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.model.Employee;
import com.nagarro.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> emps = (List<Employee>) employeeRepository.findAll();
		return emps;
	}

	public Optional<Employee> getEmployee(int id) {
		return employeeRepository.findById(id);
	}

	public void updateEmployee(Employee emp, int id) {
		if (id == emp.getEmployeeCode()) {
			employeeRepository.save(emp);
		}
	}

}
