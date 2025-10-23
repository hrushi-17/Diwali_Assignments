package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	static List<Employee> lst;
	static {
		lst = new ArrayList<>();
	}

	@Override
	public void readData(String string) {
		// TODO Auto-generated method stub
		
		File f = new File("employee.txt"); // (1)
	    if (f.exists())                   // (2)
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) { // (3)
	            while (true) {            // (4)
	                try {
	                    Employee e = (Employee) ois.readObject(); // (5)
	                    lst.add(e);                               // (6)
	                } catch (EOFException e) {                    // (7)
	                    System.out.println("Reached end of file.");
	                    break;                                   // (8)
	                }
	            }
	        } catch (IOException | ClassNotFoundException e) {    // (9)
	            e.printStackTrace();
	        }
		
	}

	@Override
	public boolean saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		lst.add(e);

		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		
		for(Employee e: lst) {
			if(e.getEmpID()==id) {
				return lst.remove(e);
			}
		}
		return false;
	}

	@Override
	public List<Employee> showAllEmp() {
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public List<Employee> sortedEmployee() {
		// TODO Auto-generated method stub
		lst.sort(null);

		return lst;
	}

	@Override
	public Employee findEmplByName(String nm) {
		// TODO Auto-generated method stub
		Optional<Employee> op = lst.stream().filter(e -> e.getEmpName().equals(nm)).findFirst();

		if (op.isPresent())
			return op.get();

		return null;
	}

	@Override
	public List<Employee> findEmplsByName(String nm) {
		// TODO Auto-generated method stub
		List<Employee> op = lst.stream().filter(e -> e.getEmpName().equals(nm)).collect(Collectors.toList());

		if (op != null)
			return op;

		return null;
	}

	@Override
	public boolean addedToFile(String string) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(string))){
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
