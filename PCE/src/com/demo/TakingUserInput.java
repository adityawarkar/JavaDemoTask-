package com.demo;

import java.util.Scanner;

public class TakingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your Name");
        String name = sc.nextLine();

        System.out.println("Please Enter your age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Please Enter your gender");
        String gender = sc.nextLine();

        System.out.println("Please Enter your Mobile No");
        String mobileNo = sc.nextLine();

        System.out.println("Please Enter your Address");
        String address = sc.nextLine();

        System.out.println("Please Enter your College ID");
        String collegeId = sc.nextLine();

        System.out.println("Please Enter your College Name");
        String collegeName = sc.nextLine();

        System.out.println("Please Enter your Aadhaar No");
        String aadhaarNo = sc.nextLine();

        System.out.println("Please Enter your Email");
        String email = sc.nextLine();
        
        System.out.println("Please Enter your status");
        String status = sc.nextLine();

        
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Address: " + address);
        System.out.println("College ID: " + collegeId);
        System.out.println("College Name: " + collegeName);
        System.out.println("Aadhaar No: " + aadhaarNo);
        System.out.println("Email: " + email);
        System.out.println("status: " + status);

        sc.close();
    }
}
