package Inheritance;

public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student();
		//s=null;
		Bike b = new Bike("Honda",70000,"Black");
		s.hasA(b);
		System.out.println("========================");
		System.out.println(s.ht.getJob());
		System.out.println(s.ht.getWeight());
		

	}

}
class Student{
	Heart ht = new Heart("job",300);
	void hasA(Bike b) {
		System.out.println(b.getbrand());
		System.out.println(b.getprice());
		System.out.println(b.getcolor());
	}
}
class Bike{
	String brand;
	double price;
	String color;
	public Bike(String brand, double price,String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public  String getbrand() {
		return brand;
	}
	public double getprice() {
		return price;
	}
	public String getcolor() {
		return color;
	}
}
class Heart {
	String job;
	double weight;
	public Heart(String job, double weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public double getWeight() {
		return weight;
	}
}