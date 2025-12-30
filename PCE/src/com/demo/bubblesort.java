//(Write a Java program to implement Bubble Sort to 
//arrange elements of an array in ascending order.)


package com.demo;

public class bubblesort {

    public static void main(String[] args) {
        
        int a[] = {50,10,20,40,30};  // fixed brackets

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
