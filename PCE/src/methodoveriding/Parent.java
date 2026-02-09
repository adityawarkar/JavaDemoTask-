package methodoveriding;

class Parent {
    static void disp() {
        System.out.println("this is parent method");
    }
}

class Child extends Parent {
  
    static void disp() {
        System.out.println("this is child method");
    }
}