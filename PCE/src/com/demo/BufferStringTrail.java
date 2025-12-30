//(Write a Java program to illustrate how StringBuffer
//manages capacity using different methods.)

package com.demo;

public class BufferStringTrail {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
//		sb.append("Ronaldo"); 
//		System.out.println(sb.capacity());
//		sb.append("Ronaldo"); 
//		System.out.println(sb.capacity()); 
		
//		StringBuffer sb=new StringBuffer(10);
//		System.out.println(sb.capacity());
		
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(31);
//		System.out.println(sb.capacity());
	
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
		
	}
}