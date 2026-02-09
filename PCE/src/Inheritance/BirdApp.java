package Inheritance;

public class BirdApp {

	public static void main(String[] args) {
		
		//Sparrow s=new Sparrow();  
		// ⫸⫸⫸Rule 1:(we cannot create an object class)
		duty(new VegSparrow());
		duty(new NonVegSparrow());
	}
	static void duty(Bird b) {
		b.eat();
		b.fly();
		System.out.println(b.x);
	}

}

//⫸⫸⫸Rule:2An abstract class may or may not have an abstract method.
//abstract class Sparrow{
//	abstract void eat();
//	void fly() {
//		System.out.println("Sparrow Is Flying");
//	}
//}


//⫸⫸⫸Rule:3 (A child class inheriting from an abstract class(parent class) 
//must implement the abstract method present in the class.)
//abstract class Bird{
//	abstract void eat();
//	abstract void fly();
//	
//}
//class Sparrow extends Bird{
//	void eat() {
//		System.out.println("Sparrow is eating")
//	}
//}

abstract class Bird{
	int x;
	abstract void eat();
	abstract void fly();
}
abstract class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow is flying");
	}
}
class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eat grains");
	}
}
class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("nonveg sparrow eat worms");
	}
}



