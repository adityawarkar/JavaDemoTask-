package com.demo;

class Fan{
	String Brand;
	double gst;
	String color;
}
public class DemoFan {

	public static void main(String[] args) {
		
		Fan f1= new Fan();
		f1.Brand="Orient";
		f1.gst=18.0;
		f1.color="White";
		
		System.out.println("Brand:"+f1.Brand);
		System.out.println("gst:"+f1.gst+"%");
		System.out.println("color:"+f1.color);
		

	}

}
