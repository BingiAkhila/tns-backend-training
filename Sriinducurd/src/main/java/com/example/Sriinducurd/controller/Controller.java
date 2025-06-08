package com.example.Sriinducurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sriinducurd.entity.Employee;
import com.example.Sriinducurd.service.EmployeeService;

@RestController
public class Controller {
	@Autowired
	private EmployeeService eser;
	//adding data
	@PostMapping("/addemp")
	public Employee regEmp(@RequestBody Employee emp) {
		return eser.addEmp(emp);
	}
	//Get data
	@GetMapping("/getemp")
	public List<Employee> getEmployee(){
		return eser.getEmp();
	}
	//update
	@PutMapping("/updateemp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return eser.updateEmp(emp);
	}
	//delete
	@DeleteMapping("/deleteemp/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		eser.deleteEmp(id);
	}

}
