package com.demo;

import java.util.Scanner;

public class Employees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] employees = new String[5];
        System.out.println("Please Enter names of 5 employees:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of Employee " + (i + 1) + ": ");
            employees[i] = sc.nextLine();
        
        }

        sc.close();
    }
}
