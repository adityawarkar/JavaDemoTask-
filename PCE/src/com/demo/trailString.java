package com.demo;

public class trailString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="Arsh";
		String S2="Arsh";
		
		if(S1==S2) {
			System.out.println("Refrences are equals");
		}
		else 
		{
			System.out.println("Refrences after not equals");
		}
		if(S1.equals (S2)) 
		{
			System.out.println("Values  are equal");
			}
			else 
			{
				System.out.println("Values are not equals");
			}
		
	}
}
