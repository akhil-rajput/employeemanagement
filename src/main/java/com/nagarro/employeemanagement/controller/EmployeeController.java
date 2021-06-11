package com.nagarro.employeemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.employeemanagement.model.Employee;
import com.nagarro.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		employeeService.updateEmployee(employee, id);
	}

}