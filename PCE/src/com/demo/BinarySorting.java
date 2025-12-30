//(Write a Java program to search an element in a 
//sorted array using binary search technique.)

package com.demo;

import java.util.Scanner;

public class BinarySorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {10, 20, 30, 40, 50};
        int low = 0;
        int high = a.length - 1;   
        int mid;   
        boolean found = false;
        int idx = -1;

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == key) {
                found = true;
                idx = mid;
                break;   
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
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
