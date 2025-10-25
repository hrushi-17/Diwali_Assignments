package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	void readFile(String fileName);

	boolean saveStudent(Student stu);

	boolean writeToFile(String fileName);

	List<Student> display();

}
