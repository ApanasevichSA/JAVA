package com.company;

import java.util.ArrayList;

/**
 * Created by admin on 21.06.2017.
 */
public class Root {
    private String name;
    private ArrayList<People> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList <People> getPeople() {
        return people;
    }

    public void setPeople(ArrayList <People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Name: " + name + " People: " + people;
    }
}
