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
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	private static Set<Student> lst = new TreeSet<>();

	@Override
	public void readFile(String fileName) {
		// TODO Auto-generated method stub
		
		File file = new File(fileName);
        if(file.exists()) {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                while(true) {
                    try {
                        Student s = (Student) ois.readObject();
                        lst.add(s);
                    } catch(EOFException e) {
                        break;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("File read successfully.");
		
	}

	@Override
	public boolean saveStudent(Student stu) {
		// TODO Auto-generated method stub
		if(stu==null) 
			return false;
		lst.add(stu);
		return true;
	}

	@Override
	public boolean writeToFile(String fileName) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for(Student s : lst) {
                oos.writeObject(s);
            }
            return true;
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		for(Student s : lst) {
			list.add(s);
		}
		
		return list;
		
//		return new ArrayList<>(lst);
		
		
	}
	
	

}
