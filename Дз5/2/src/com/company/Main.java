package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ATM atm = new ATM(100, 100, 100, "Alpha");
        atm.countPaper();

        System.out.println("Введите пароль для открытия сейфа:");
        int pass = Integer.parseInt(reader.readLine());

        atm.openSafe(pass, 5, 6, 8);
        atm.countPaper();
        for(int i = 0; i < 5; i++){
            atm.countPaper();
            System.out.println("Введите сумму для снятия");
            int sum = Integer.parseInt(reader.readLine());
            if (!atm.isTake(sum)){
                System.out.println("Даннуя сумма недоступна");
            }
        }



    }
}
