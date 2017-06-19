package com.company;

/**
 * Created by admin on 19.06.2017.
 */
public class Student {
    private int age;
    private int id;
    private boolean isDegree;
    private String name;
    private String surname;

    public Student(int age, int id, boolean isDegree, String name, String surname) {
        this.age = age;
        this.id = id;
        this.isDegree = isDegree;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDegree() {
        return isDegree;
    }

    public void setIsDegree(boolean isDegree) {
        this.isDegree = isDegree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Возраст: " + age + "\nID: " + id + "\nСтепень: " + isDegree + "\nИмя: " + name + "\nФамилия: " + surname;
    }
}
