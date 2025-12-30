//(Que- write a java code whether an element 
//given by the user is present in array or not.)

package com.demo;

import java.util.Scanner;

public class ArrayQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};
        System.out.print("Please Enter the key to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int idx = -1; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                idx = i; 
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Key found at index: " + idx);
        } else {
            System.out.println("Key not found");
        }

        sc.close();
    }
}
