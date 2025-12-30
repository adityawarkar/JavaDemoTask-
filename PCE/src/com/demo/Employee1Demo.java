package com.demo;

class Employee1 {
    private int emp_Id;
    private String name;
    private int salary;

    
    public Employee1(int emp_Id, String name, int salary) {
        this.emp_Id = emp_Id;
        this.name = name;
        this.salary = salary;
    }

    
    public Employee1() {
        this(101,"Arsh",20);
    }

    
    public int getEmpId() {
        return emp_Id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Employee1Demo {
    public static void main(String[] args) {
        Employee e = new Employee(101,"Arsh",20);
        System.out.println(e.getEmpId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

//        Employee e1 = new Employee(102, "Addi", 30);
//        System.out.println(e1.getEmpId());
//        System.out.println(e1.getName());
//        System.out.println(e1.getSalary());
    }
}
