package com.demo;

class Calculator {
	int add() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
}
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator C=new Calculator();
		int res=C.add();
		
		System.out.println(res);
	}

}
