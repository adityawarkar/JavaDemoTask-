package com.demo;

class Thispointer {
    String name;
    int age;
    String gender;

   
    public Thispointer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {   
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class ThispointerDemo {
    public static void main(String[] args) {
        Thispointer S = new Thispointer("Arsh", 50, "Male");
        System.out.println(S.getName());
        System.out.println(S.getAge());
        System.out.println(S.getGender());
    }
}
