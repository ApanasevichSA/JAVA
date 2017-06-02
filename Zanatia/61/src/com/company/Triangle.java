package com.company;

/**
 * Created by user on 02.06.2017.
 */
public class Triangle extends Figura {
    private int a;
    private int b;
    private int c;

    public Triangle(int b, int c, int a) {
        if (a + b > c && a + c > b && b + c > a){
            this.b = b;
            this.c = c;
            this.a = a;
        }
        else
        {
            System.out.println("Не существует");
            a = 0;
            b = 0;
            c = 0;
        }
        setName("Треугольник");

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt((p-a)*(p-a) + (p-b)*(p-b) + (p-c)*(p-c));
    }
}
