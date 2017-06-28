package com.company;

public class Main {

    static AffableThread mSecondThread;
    static EggVoice mAnotherOpinion; // побочный поток

    //Переменая, которой оперирует инкременатор
    public static int mValue = 0;
    static Incremenator mInc;	//Объект побочного потока


    public static void main(String[] args) {
	// write your code here
        // поток первым способом
        Thread myThready = new Thread(new Runnable() {
            @Override
            public void run() {  //  это метод будет выполнен в побочном потоке
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start(); // запуск потока
        System.out.println("Главный поток завершен...");

        // поток вторым способом
        mSecondThread = new AffableThread(); // создаем поток
        mSecondThread.start(); // запуск потока
        System.out.println("Главный поток 1");
        System.out.println("Главный поток 2");
        System.out.println("Главный поток 3");
        System.out.println("Главный поток 4");
        System.out.println("Главный поток 5");
        System.out.println("Главный поток 6");
        System.out.println("Главный поток 7");

        mAnotherOpinion = new EggVoice(); // Создать поток
        System.out.println("Спор начат...");
        mAnotherOpinion.start();  // запуск потока
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000); // остоновка потока на 1 секунду
            }catch (InterruptedException e) {}

            System.out.println("курица");
        }

        if (mAnotherOpinion.isAlive()){
            try {
                mAnotherOpinion.join(); // подождать пока опонент закончит высказываться
            }catch (InterruptedException e){}
            System.out.println("Первым появилось яйцо!!!");
        }
        else{
            System.out.println(":Первой появилась курица!!!");
        }
        System.out.println("Спор завершен!");

        mInc = new Incremenator();	//Создание потока

        System.out.print("Значение = ");

        mInc.start();	//Запуск потока

        //Троекратное изменение действия инкременатора
        //с интервалом в i*2 секунд
        for(int i = 1; i <= 3; i++)
        {
            try{
                Thread.sleep(i*2*1000); //Ожидание в течении i*2 сек.
            }catch(InterruptedException e){}

            mInc.changeAction();	//Переключение действия
        }

        mInc.finish();	//Инициация завершения побочного потока

    }
}
