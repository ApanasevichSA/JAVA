package com.company;

/**
 * Created by user on 14.06.2017.
 */
public class Student /*implements Comparable<Student>*/{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

/*    @Override
    public int compareTo(Student o) {
        if(this.getAge() > o.getAge()){
            return 1;
        }
        else if (this.getAge() == o.getAge()){
            return 0;
        }
        else{
            return -1;
        }
       // return name.compareTo(o.getName());
    }*/
}
