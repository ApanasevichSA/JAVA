package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        myCar(new Blue());
        myCar(new Red());
        Car r = new Red();
        Car b = new Blue();
        myCar(r);
        myCar(b);
    }

    public static void myCar(Car car){
        if (car instanceof Red){
            System.out.println("Red of car");
            Red r = (Red)car;
            r.test();
        }
        else{
            System.out.println("Blue of car");
        }

        System.out.println(car.getColor());
    }
}
