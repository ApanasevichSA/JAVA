package com.company;

/**
 * Created by Admin on 08.07.17.
 */
public class Test {
    private String str;
    private int a;
    private float f;


    public Test(String str, int a, float f) {
        this.str = str;
        this.a = a;
        this.f = f;
    }

    public float getF() {
        return f;
    }

    public String getStr() {
        return str;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "String: " + str + "; Int: " + a + "; Float: " + f + ".";
    }
}
