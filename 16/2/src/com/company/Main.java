package com.company;

public class Main {

    public static int value = 1;

    static Stream stream1;
   // static Stream stream2;

    public static void main(String[] args) {
	// write your code here
        stream1 = new Stream();
       // stream2 = new Stream(1, "Поток 2: ");

        stream1.start();
      //  stream2.start();

        for(int i = 1; i <= 10; i++)
        {
            try{
                Thread.sleep(i*500); //Ожидание в течении i*2 сек.
            }catch(InterruptedException e){}

            stream1.changeAction();	//Переключение действия
        }
        stream1.finish();
    }

    public static void print10(int n){
        for(int i = n; i < n+10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
