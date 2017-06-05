package com.company;

/**
 * Created by user on 05.06.2017.
 */
public class Student implements Pepole, Uchenik {
    @Override
    public void test() {
        System.out.println("Человек - студент");
    }

    @Override
    public void uchenik() {
        System.out.println("Ученик - студент");
    }
}
