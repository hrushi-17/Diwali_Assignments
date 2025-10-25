package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	private int roll;
	private String sname;
	private String course;
	private float attendance_percentage;
	private int score;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int roll, String sname, String course, float attendance_percentage, int score) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.course = course;
		this.attendance_percentage = attendance_percentage;
		this.score = score;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public float getAttendance_percentage() {
		return attendance_percentage;
	}


	public void setAttendance_percentage(float attendance_percentage) {
		this.attendance_percentage = attendance_percentage;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	// Method to calculate grade based on score
    public String calculateGrade() {
        if(score >= 90) return "A+";
        else if(score >= 80) return "A";
        else if(score >= 70) return "B";
        else if(score >= 60) return "C";
        else return "D";
    }


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", course=" + course + ", attendance_percentage="
				+ attendance_percentage + ", score=" + score + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.attendance_percentage == o.attendance_percentage) {
            return this.roll - o.roll; // ascending rollno if attendance same
        }
        return Float.compare(o.attendance_percentage, this.attendance_percentage); // descending attendance
	}

	
	
	
	
}