
package Inheritance;

public class StudentDemo {

    public static void main(String[] args) {
        Student1 s = new Student1();

        System.out.println("*****************");
        Bike1 b4 = new Bike1("Honda", 80000);
        s.hasA(b4);
        System.out.println("*****************");
        Book1 b5 = new Book1("Unseen life", 50);
        s.hasA(b5);

        System.out.println("========================");
        System.out.println("---------Brain----------");
        System.out.println(s.getBrain().getCells());
        System.out.println(s.getBrain().getWeight());

        System.out.println("========================");
        System.out.println("---------Heart----------");
        System.out.println(s.getHeart2().getJob());
        System.out.println(s.getHeart2().getWeight());
    }
}

class Human {
    private Heart2 h = new Heart2("Pump Blood", 3.0);
    private Brain b = new Brain(1000, 1.0);

    public Heart2 getHeart2() {
        return h;
    }

    public Brain getBrain() {
        return b;
    }
}

class Student1 extends Human {
    void hasA(Bike1 b2) {
        System.out.println("---------Bike----------");
        System.out.println(b2.getBrand());
        System.out.println(b2.getPrice());
    }

    void hasA(Book1 b3) {
        System.out.println("---------Book----------");
        System.out.println(b3.getName());
        System.out.println(b3.getPrice());
    }
}

class Heart2 {
    private String job;
    private double weight;

    public Heart2(String job, double weight) {
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

class Brain {
    private int cells;
    private double weight;

    public Brain(int cells, double weight) {
        this.cells = cells;
        this.weight = weight;
    }

    public int getCells() {
        return cells;
    }

    public double getWeight() {
        return weight;
    }
}

class Bike1 {
    private String brand;
    private double price;

    public Bike1(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}

class Book1 {
    private String name;
    private double price;

    public Book1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
