package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	static EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		
		edao = new EmployeeDaoImpl();
	}

	static Scanner sc = new Scanner(System.in);

	@Override
	public void readFile(String string) {
		// TODO Auto-generated method stub
		
		edao.readData(string);
		
	}


	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Employee ID: ");
	    int id = sc.nextInt();
	    System.out.print("Enter Employee Name: ");
	    String name = sc.next();

	    System.out.println("Choose constructor option:");
	    System.out.println("1. No-arg constructor");
	    System.out.println("2. Constructor with ID & Name");
	    System.out.println("3. Constructor with ID, Name & Role");
	    int choice = sc.nextInt();

	    Employee e = null;

	    switch (choice) {
	        case 1 -> e = new Employee();
	        case 2 -> e = new Employee(id, name);
	        case 3 -> {
	            System.out.print("Enter Role: ");
	            String role = sc.next();
	            e = new Employee(id, name, role);
	        }
	        default -> {
	            System.out.println("Invalid choice!");
	            return false;
	        }
	    }

	    return edao.saveEmployee(e);
	}


	@Override
	public boolean removeEmp(int id) {
		// TODO Auto-generated method stub
		return edao.removeEmployee(id);
	}


	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.showAllEmp();
	}


	@Override
	public List<Employee> sortEmpl() {
		// TODO Auto-generated method stub
		return edao.sortedEmployee();
	}


	@Override
	public Employee findByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findEmplByName(nm);
	}


	@Override
	public List<Employee> findEmplsByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findEmplsByName(nm);
	}


	@Override
	public boolean addtoFile(String string) {
		// TODO Auto-generated method stub
		return edao.addedToFile(string);
	}

}
