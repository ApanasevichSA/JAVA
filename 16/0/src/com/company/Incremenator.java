package com.company;

/**
 * Created by Admin on 28.06.17.
 */
public class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public void changeAction()	//Меняет действие на противоположное
    {
        mIsIncrement = !mIsIncrement;
    }
    public void finish()		//Инициирует завершение потока
    {
        mFinish = true;
    }

    @Override
    public void run()
    {
        do
        {
            if(!mFinish)	//Проверка на необходимость завершения
            {
                if(mIsIncrement)
                    Main.mValue++;	//Инкремент
                else
                    Main.mValue--;	//Декремент

                //Вывод текущего значения переменной
                System.out.print(Main.mValue + " ");
            }
            else
                return;		//Завершение потока

            try{
                Thread.sleep(1000);		//Приостановка потока на 1 сек.
            }catch(InterruptedException e){}
        }
        while(true);
    }
}
