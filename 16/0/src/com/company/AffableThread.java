package com.company;

/**
 * Created by Admin on 28.06.17.
 */
public class AffableThread extends Thread {

    @Override
    public void run() { // метод выполняется в побочном потоке
        System.out.println("Привет из побочного потока 1");
        System.out.println("Привет из побочного потока 2");
        System.out.println("Привет из побочного потока 3");
        System.out.println("Привет из побочного потока 4");
        System.out.println("Привет из побочного потока 5");
        System.out.println("Привет из побочного потока 6");
        System.out.println("Привет из побочного потока 7");

    }
}

