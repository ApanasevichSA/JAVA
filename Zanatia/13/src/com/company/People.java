package com.company;

/**
 * Created by user on 19.06.2017.
 */
public class People {
    private int age;
    private int id;
    private boolean IsDegree;
    private String name;
    private String surname;

    public People(int age, int id, boolean isDegree, String name, String surname) {
        this.age = age;
        this.id = id;
        IsDegree = isDegree;
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

    public boolean isIsDegree() {
        return IsDegree;
    }

    public void setIsDegree(boolean IsDegree) {
        this.IsDegree = IsDegree;
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

}
