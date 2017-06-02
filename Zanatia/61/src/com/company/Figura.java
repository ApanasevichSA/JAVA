package com.company;

/**
 * Created by user on 02.06.2017.
 */
public abstract class Figura {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();
}
