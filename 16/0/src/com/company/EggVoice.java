package com.company;

/**
 * Created by Admin on 28.06.17.
 */
public class EggVoice extends Thread {

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 5; i++){
            try{
                sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("яйцо!");
        }
    }
}
