package com.demo;

import java.util.Scanner;

public class StudentArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the no. classes");
        int n=sc.nextInt();
        int a[][] = new int[n][];
        
        for(int i=0;i<n;i++) {
        	System.out.print("Please enter the no. of students present in class:"+i);
            int b=sc.nextInt();
            a[i] = new int[b]; 
        	
        }
        
//        System.out.print("Please enter the no. of students present in class 0");
//        int b=sc.nextInt();
//        a[0] = new int[b];
//        System.out.print("Please enter the no. of students present in class 1");
//        b=sc.nextInt();
//        a[1] = new int[b];
//        System.out.print("Please enter the no. of students present in class 2");
//        b=sc.nextInt();
//        a[2] = new int[b]; 
       
       
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Please enter the marks of Class " + i + " Student " + j + ": ");
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("Class " + i + ": ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
