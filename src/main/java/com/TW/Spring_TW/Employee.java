package com.TW.Spring_TW;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }
}
