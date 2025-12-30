package Inheritance;


public class Player {
    String name;
    int age;
    String gender;
}


class Football extends Player {
    int goals;
    int assist;

    
    public Football(String name, int age, String gender, int goals, int assist) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goals = goals;
        this.assist = assist;
    }

    
    public int getGoals() {
        return goals;
    }

    public int getAssist() {
        return assist;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}


