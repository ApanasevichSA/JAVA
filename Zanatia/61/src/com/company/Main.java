package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Figura f;
        myArea(new Square(5));
        myArea(new Rectangle(5,6));
        myArea(new Triangle(3,4,5));

        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b;

    }

    public static void myArea(Figura f){
        System.out.println(f.getName());
        System.out.println("S = " + f.getArea());
    }
}
