package com.demo;

import java.util.Scanner;

public class StudentArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[][] a = new int[3][5];

        
        for (int i = 0; i < a.length; i++) {                 
            for (int j = 0; j < a[i].length; j++) {          
                System.out.println("Please enter the marks of Class " + i + " Student " + j + ": ");
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
