package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Задача №1
        System.out.println("Задача №1");
        System.out.println("Введите строку");
        String str = reader.readLine();
        int len = str.length();
        System.out.println(" Длина строки '" + str + "' = " + len);
        String str2 = String.copyValueOf(str.toCharArray(), 0, len/2);
        String str3 = null;
        if (len % 2 == 0){
            str3 = String.copyValueOf(str.toCharArray(), len/2, len/2);
        }
        else{
            str3 = String.copyValueOf(str.toCharArray(), len/2, len/2+1);
        }
        System.out.println("Первая часть строки: " + str2);
        System.out.println("Вторая часть строки: " + str3);

        System.out.println("");
        System.out.println("Задача №2");
        System.out.println("Введите число");
        int x = Integer.parseInt(reader.readLine());
        if (x % 10 == 7){
            System.out.println("Число " + x + " заканчивается на 7");
        }
        else{
            System.out.println("Число " + x + " не заканчивается на 7");
        }

        System.out.println("");
        System.out.println("Задача №3");
        System.out.println("Введите строну a");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите строну b");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите радиус r");
        int r = Integer.parseInt(reader.readLine());
        double dig = Math.sqrt(a*a + b*b);
        if (2*r >= dig){
            System.out.println("Круг закроет прямоугольник");
        }
        else{
            System.out.println("Круг не закроет прямоугольник");
        }

        System.out.println("");
        System.out.println("Задача №4");
        System.out.println("Введите количество рублей");
        int rub = Integer.parseInt(reader.readLine());
        if (rub % 100 /10 == 1){
            System.out.println(rub + " рублей");
        }
        else{
            switch (rub % 10){
                case 1:{
                    System.out.println(rub + " рубль");
                    break;
                }
                case 2:
                case 3:
                case 4:{
                    System.out.println(rub + " рубля");
                    break;
                }
                default:
                    System.out.println(rub + " рублей");
            }
        }

        System.out.println("");
        System.out.println("Задача №5");
        System.out.println("Введите строку");
        String str4 = reader.readLine();
        System.out.println("Исходная строка: " + str4);
        str4 = str4.replaceAll("\\?", "HELLO");
        str4 = str4.replaceAll("#", "");
        System.out.println("Измененная строка: " + str4);

        System.out.println("");
        System.out.println("Задача № дополнительная");
        System.out.println("Введите x");
        x = Integer.parseInt(reader.readLine());
        System.out.println("Введите s");
        int s = Integer.parseInt(reader.readLine());
        System.out.println("Введите t");
        int t = Integer.parseInt(reader.readLine());
        double result = Math.pow(Math.sin(Math.pow(x,t)),2)/Math.sqrt(1+Math.pow(x,s));
        System.out.println("Ответ: " + result);

    }
}
