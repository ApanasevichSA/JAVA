package com.company;

/**
 * Created by user on 09.06.2017.
 */
public class Doctor {

    private int a =1;
    private static  int  i = 5;

    public static void dd(){}
    public void tester(){
      Tuner tuner = new Tuner();
        a = tuner.in;
        tuner.test();
    }

    public static class Tuner{

        private int in = 10;


        private void test(){
            int b =  Doctor.i;

        }

    }
}
