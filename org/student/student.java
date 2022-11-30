package org.student;

import org.department.department;

public class student extends department {
	
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Print the Student Name");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
System.out.println("Print the Student Department Name");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub
System.out.println("Print the Student Id");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj =new student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
		
	}

}
