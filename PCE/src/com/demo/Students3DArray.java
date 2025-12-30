package com.demo;

import java.util.Scanner;

public class Students3DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of colleges (n): ");
        int n = sc.nextInt();

       
        int[][][] students = new int[n][][];

       
        for (int college = 0; college < n; college++) {
            System.out.print("Enter number of classes in College " + college + " (i): ");
            int numClasses = sc.nextInt();
            students[college] = new int[numClasses][];

           
            for (int cls = 0; cls < numClasses; cls++) {
                System.out.print("Enter number of students in College " + college + " Class " + cls + " (k): ");
                int k = sc.nextInt();
                students[college][cls] = new int[k]; 
            }
        }

        // Output structure
        
        for (int college = 0; college < students.length; college++) {
            System.out.println("College " + college + ":");
            for (int cls = 0; cls < students[college].length; cls++) {
                System.out.println(" Class " + cls + " has " + students[college][cls].length + " students");
            }
        }

        sc.close();
    }
}
