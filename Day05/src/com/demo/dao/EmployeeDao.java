package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readData(String string);

	boolean saveEmployee(Employee e);

	boolean removeEmployee(int id);

	List<Employee> showAllEmp();

	List<Employee> sortedEmployee();

	Employee findEmplByName(String nm);

	List<Employee> findEmplsByName(String nm);

	boolean addedToFile(String string);

}
