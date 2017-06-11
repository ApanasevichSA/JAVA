package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ATM atm = new ATM(100, 100, 100, "Alpha");
        atm.setListener(new OnMoneyListener() {
            @Override
            public void onTake(int errorKod) {
                // 1 - деньги сняты, печатать чек, 2 - нужжная сумму есть, но имеющимися банкнотами ее нельзя представить,
                // 3 - в банкомате нет достаточной суммы
                switch (errorKod){
                    case 1:{
                        System.out.println("Чек распечатан.");
                        break;
                    }
                    case 2:{
                        System.out.println("Нужжная сумму есть, но имеющимися банкнотами ее нельзя представить!");
                        break;
                    }
                    case 3:{
                        System.out.println("В банкомате нет достаточной суммы!!");
                        break;
                    }
                    default:{
                        System.out.println("Системная ошибка, повторите попытку позже!!!");
                    }
                }
            }

            @Override
            public void onPut(boolean errorKod) {
                // метод открытия сейфа для пополнения количества купюр
                // true - пароль введен верно и деньги добавлены, false - в доступе отказано
                if(errorKod)
                {
                    System.out.println("Деньги в сейф добавлены.");
                }
                else{
                    System.out.println("Ошибочный пароль. Введите заново, если знаете, иначе убегайте!!!");
                }
            }
        });
        atm.countPaper();

        System.out.println("Введите пароль для открытия сейфа:");
        int pass = Integer.parseInt(reader.readLine());
        // метод добовления денег в сейф, нужно знать пароль от сейфа
        atm.put(pass, 5, 6, 8);
        atm.countPaper();
        for(int i = 0; i < 5; i++){
            atm.countPaper();
            System.out.println("Введите сумму для снятия");
            int sum = Integer.parseInt(reader.readLine());
            atm.take(sum);
        }



    }




}
