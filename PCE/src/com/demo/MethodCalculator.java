package com.demo;

class Calci {
    int add(int a, int b) {   
        int C = a + b;
        return C;             
    }
}

public class MethodCalculator {
    public static void main(String[] args) {
        
        Calci c = new Calci();
        int res = c.add(10, 20);   
        System.out.println(res);
    }
}
