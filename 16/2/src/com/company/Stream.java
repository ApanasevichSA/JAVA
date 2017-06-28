package com.company;

/**
 * Created by Admin on 28.06.17.
 */
public class Stream extends Thread {
    private volatile boolean mIsStream = true; // true  первый поток, иначе второй
    private volatile boolean mFinish = false;  // остановить потоки


    public void changeAction()	//Меняет действие на противоположное
    {
        mIsStream = !mIsStream;
    }
    public void finish()		//Инициирует завершение потока
    {
        mFinish = true;
    }

    @Override
    public void run() {
        do {
            if (!mFinish && Main.value < 101)    //Проверка на необходимость завершения
            {
                if (mIsStream) {
                    System.out.print("Поток 1: ");
                    Main.print10(Main.value);
                    Main.value += 10;
                } else {
                    System.out.print("Поток 2: ");
                    Main.print10(Main.value);
                    Main.value += 10;
                }
            } else
                return;        //Завершение потока

            try {
                Thread.sleep(1000);        //Приостановка потока на 1 сек.
            } catch (InterruptedException e) {
            }
        }while (true);

    }
}
