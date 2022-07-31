package org.student;

import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		Student details = new Student();
				//details.getSdetails();
		
		details.getStudentInfo("Santhosh", "Mechanical", 123, "abc@email.com", 123123);	
		details.getStudentInfo("arnav", "elect", 122, "aer@email.com", 123333);	
	
	}
	public void getSdetails(){
		studentName("Santhosh");
		studentId(313);
		studentDept("Mechanical");
		collegeCode(110);
		collegeName("ACIT");
		collegeRank(01);

	}
		
	public void studentName(String sName) {
		System.out.println("Student name is " +sName);
	}
	
	public void studentDept(String deptName) {
		System.out.println("Student Department name  is " +deptName);
	}
	
	public void studentId(int sID) {
		System.out.println("Student ID is " +sID);
	}
	
	public void studentEmail(String sEmail) {
		System.out.println("Student Email is " +sEmail);
	}
	
	public void studentPhone(int sPhone) {
		System.out.println("Student phone is " +sPhone);
	}
	
	public void getStudentInfo(String info1,String info2,int info3,String info4,int info5) {
		
		studentName(info1);
		studentDept(info2);
		studentId(info3);
		studentEmail(info4);
		studentPhone(info5);
		
	}

	
}
