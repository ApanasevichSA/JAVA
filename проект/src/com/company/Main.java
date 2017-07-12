package com.company;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main implements OnConvertListener {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Convert convert = new Convert();
        convert.setListener(new Main());
        String  convertVal, ishVal, deistvie;

        int ishSum;
        double convertSum;
        do{
            System.out.println("Для продолжения работы введеите: Next. Для завершение: Close ");
            deistvie = reader.readLine();
            if (deistvie.equals("Next")){
                System.out.println(Manny.nameCurrency);
                System.out.println("Введите краткое название валюты (см. выше) с которой переводим");
                try{
                    ishVal = reader.readLine();
                    System.out.println("Введите краткое название валюты (см. выше) в которую переводим");
                    convertVal = reader.readLine();
                    System.out.println("Введите сумму перевода:");
                    ishSum = Integer.parseInt(reader.readLine());
                }
                catch(Throwable t){
                    System.out.println("Ошибка ввода!!! Программа завершает работу!!!");
                    System.out.println("Для ввода новых данных введите Yes");
                    String error = reader.readLine();
                    if(error.equals("Yes")){
                        continue;
                    }else{
                        System.out.println("Программа завершает работу!!!");
                        break;
                    }

                    // continue; // для продолжения работы
                }
                if (convert.isCurrency(convertVal)){
                    // переведем найденную валюту
                    convertSum = convert.convertVal(ishVal,convertVal,ishSum);
                    System.out.println("Результат: " + convertSum + " " + Manny.nameCurrency.get(convertVal));
                }else{
                    System.out.println("Данной валюты нет, или произведен ошибочный ввод названия валюты");
                }

                }else if (deistvie.equals("Close")){
                    System.out.println("Работа завершена");
                    break;
            }


        }while (true);
    }


    @Override
    public void onConvert(int errorCod) {
        // 1 - успешно конвертированно, 2 - нужной валюты нет,
        // 3 -  валюта для перевода есть
        switch (errorCod){
            case 1:{
                System.out.println("Чек распечатан.");
                break;
            }
            case 2:{
                System.out.println("Нужжной валюты нет!");
                break;
            }
            case 3:{
                System.out.println("Валюта для перевода есть!");
                break;
            }
            default:{
                System.out.println("Системная ошибка, повторите попытку позже!!!");
            }
        }
    }
}
