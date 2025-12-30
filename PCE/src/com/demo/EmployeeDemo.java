package com.demo;

class Employee extends Object{
    int emp_Id;
    String name;
    int salary;

    
    public Employee(int emp_Id, String name, int salary) {
        this.emp_Id = emp_Id;
        this.name = name;
        this.salary = salary;
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

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Arsh", 20);
        System.out.println(e.getEmpId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}


