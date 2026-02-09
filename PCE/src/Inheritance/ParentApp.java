package Inheritance;

public class ParentApp {
    public static void main(String[] args) {
        System.out.println("Creating Child with no-arg constructor:");
        Child c1 = new Child();
        System.out.println("Final values: a = " + c1.a + ", b = " + c1.b);

        System.out.println("\nCreating Child with parameterized constructor:");
        Child c2 = new Child(50, 60);
        System.out.println("Final values: a = " + c2.a + ", b = " + c2.b);
    }
}

class Parent {
    int a;
    int b;

    
    public Parent() {
        this(99, 99); 
        a = 10;
        b = 20;
        System.out.println("Zero-parameter Parent");
    }

   
    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Two-parameter Parent");
    }
}

class Child extends Parent {
    
    public Child() {
        super(); 
        a = 30;
        b = 40;
        System.out.println("Zero-parameter Child");
    }

    
    public Child(int a, int b) {
        super(a, b); // call Parent(int,int)
        System.out.println("Two-parameter Child");
    }
}
