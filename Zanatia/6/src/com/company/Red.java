package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class Red extends Car {

    public static final int color = 1;

    @Override
    public int getColor() {
        return color;
    }

    public void test(){
        System.out.println("2 + 2 = " + 4);
    }
}
