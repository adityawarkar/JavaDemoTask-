package com.demo;

import java.util.Scanner;

public class MarksDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks of Student 1");
        marks[0] = sc.nextInt();
        
        System.out.println("Enter marks of Student 2");
        marks[1] = sc.nextInt();

        System.out.println("Enter marks of Student 3");
        marks[2] = sc.nextInt();

        System.out.println("Enter marks of Student 4");
        marks[3] = sc.nextInt();

        System.out.println("Enter marks of Student 5");
        marks[4] = sc.nextInt();

        System.out.println("Student 1: " + marks[0]);
        System.out.println("Student 2: " + marks[1]);
        System.out.println("Student 3: " + marks[2]);
        System.out.println("Student 4: " + marks[3]);
        System.out.println("Student 5: " + marks[4]);

    
        sc.close();
    }
}

