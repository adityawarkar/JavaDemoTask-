package com.Exception;

import java.util.Scanner;

class Test0{
	void alpha() {
		System.out.println("connection 1 Est");
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("connection 1 Term");
	}

}
class Test2{
	void beta() {
		System.out.println("connection 2 Est");
		Test3 t3=new Test3();
		t3.gama();
		System.out.println("connection 2 Term");
	}
}
class Test3{
	void gama() {
		System.out.println("connection 3 Est");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter vol 0");
		int a=sc.nextInt();
		System.out.println("Please Enter Vol 2");
		int b=input.nex
				tInt();
		try {
			int c=a/b;
			System.out.println(c);
		}catch (Exception e) {
			System.out.println("execption handled by gama");
		}
		System.out.println("Connection 3 terminated");
		input.close();
//		int b=sc.nextInt();
//		int c=a/b;
//		System.out.println("c");
//		System.out.println("connection 3 term");	
	}
}

class Test1{
	public static void main(String[] args) {
		System.out.println("Please Enter Vol1");
		Test0 t0=new Test0();
		t0.alpha();
		
		System.out.println("Main Connection Terminated");
	}
}

