package com.company;

/**
 * Created by admin on 21.06.2017.
 */
public class People {
    private int age;
    private int id;

  //  @SerializedName("is_Degree")
    private boolean isDegree;

    private String name;
    private String surname;

    public People(int id, int age,  boolean isDegree, String name, String surname) {
        this.age = age;
        this.id = id;
        this.isDegree = isDegree;
        this.name = name;
        this.surname = surname;
    }

    public People() {
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
        return isDegree;
    }

    public void setIsDegree(boolean IsDegree) {
        this.isDegree = IsDegree;
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
        return "People{" +
                "age=" + age +
                ", id=" + id +
                ", isDegree=" + isDegree +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
