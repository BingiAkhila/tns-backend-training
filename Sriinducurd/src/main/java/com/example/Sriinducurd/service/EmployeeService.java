package com.example.Sriinducurd.service;
//CURD Operational methods

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sriinducurd.entity.Employee;
import com.example.Sriinducurd.repository.employeerepo;

@Service
public class EmployeeService {
	@Autowired
	private employeerepo erepo;
	//inserting data
	public Employee addEmp(Employee emp) {
		return erepo.save(emp);
	}
	//Get Data
	public List<Employee> getEmp(){
		return erepo.findAll();
	}
	//Update data
	//update Employee set edept="HR" where eid=101;
	public Employee updateEmp(Employee emp) {
		Integer eid=emp.getEid();
		//getEid-->user input
		//findbyid-->db input
		Employee emp1=erepo.findById(eid).get();
		emp1.setEname(emp.getEname());
		emp1.setEsal(emp.getEsal());
		emp1.setEdept(emp.getEdept());
		return erepo.save(emp1);
	}
	//delete data
	public void deleteEmp(int id) {
		erepo.deleteById(id);
	}

}
