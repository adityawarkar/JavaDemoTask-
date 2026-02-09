package com.Interface;

import java.util.Scanner;

public class kodCalciApp {

    public static void main(String[] args) {
        duty(new RupeshSoft());
        duty(new AyushInfotech());
    }

    static void duty(KoCalci k) {
        k.add();
        k.sub();
        k.mul();
        k.div();
    }
}


interface KodCalci {
    void add();
    void sub();
    void mul();
    void div();
}


class RupeshSoft implements KoCalci {
    public void add() {
        int a = 10, b = 20;
        System.out.println("Addition = " + (a + b));
    }

    public void sub() {
        int a = 10, b = 20;
        System.out.println("Subtraction = " + (a - b));
    }

    public void mul() {
        int a = 10, b = 20;
        System.out.println("Multiplication = " + (a * b));
    }

    public void div() {
        int a = 20, b = 10;
        System.out.println("Division = " + (a / b));
    }
}


class AyushInfotech implements KoCalci {
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Enter two numbers for addition:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Addition = " + (a + b));
    }

    public void sub() {
        System.out.println("Enter two numbers for subtraction:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Subtraction = " + (a - b));
    }

    public void mul() {
        System.out.println("Enter two numbers for multiplication:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Multiplication = " + (a * b));
    }

    public void div() {
        System.out.println("Enter two numbers for division:");
        int a = sc.nextInt(), b = sc.nextInt();
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }
}
