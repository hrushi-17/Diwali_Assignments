package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile(String string);

	boolean addEmployee();

	boolean removeEmp(int id);

	List<Employee> displayAll();

	List<Employee> sortEmpl();

	Employee findByName(String nm);

	List<Employee> findEmplsByName(String nm);

	boolean addtoFile(String string);

}
