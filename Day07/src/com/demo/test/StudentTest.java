package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class StudentTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name with extension:");
        String fileName = sc.next();

        StudentService sservice = new StudentServiceImpl();
        sservice.readFile(fileName);

        int choice = 0;
        do {
            System.out.println("\n1. Add Student\n2. Save in File\n3. Show All\n4. EXIT");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> {
                    boolean status = sservice.addStudent();
                    if(status) System.out.println("Student Added Successfully");
                    else System.out.println("Failed to Add Student");
                }
                case 2 -> {
                    boolean status = sservice.saveAllToFile(fileName);
                    if(status) System.out.println("Data Saved to File Successfully");
                    else System.out.println("Failed to Save Data");
                }
                case 3 -> {
                    List<Student> lst = sservice.showAll();
                    lst.forEach(System.out::println);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice");
            }
        } while(choice != 4);
    }
}
