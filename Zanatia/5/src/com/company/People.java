package com.company;

import java.util.Objects;

/**
 * Created by user on 31.05.2017.
 */
public abstract class  People extends Object {
    private static int nextID = 345;  // id следующего больного
    public int id;     // id больного
    private String name;  // имя больного
    private int age;      // возраст больного

    public People() {
        name = null;
        age = 0;
        id = nextID;
        nextID++;
    }

    public People(String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void myTest();
}
