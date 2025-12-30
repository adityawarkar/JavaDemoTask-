package Inheritance;

public class Constructorchaining {

	public static void main(String[] args) {
		Child c=new Child();

	}

}
class Parent{
	public Parent() {
		System.out.println("this is parent constructor");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("this is Child constructor");
	}
}
