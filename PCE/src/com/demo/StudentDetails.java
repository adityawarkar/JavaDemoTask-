package com.demo;

class Student {
	 String name;
	 int age;
	 String gender;
	}

public class StudentDetails {
	public static void main(String[] args) {

     Student S1 = new Student();
     S1.name = "Arsh";
     S1.age = 21; 
     S1.gender = "Male";

    
     System.out.println(S1.name);
     System.out.println(S1.age);
     System.out.println(S1.gender);
 }
}
