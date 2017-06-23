package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла с расширением:");
        String text = reader.readLine();
        typeFile(text);
    }

    static void typeFile(String fileName){

        Pattern p = Pattern.compile("[^\\s]+(\\.(xml))");
        Matcher m = p.matcher(fileName);

        if(m.matches()){
            System.out.println("Файл типа: xml");
        }
        else{
            p = Pattern.compile("[^\\s]+(\\.(json))");
            m = p.matcher(fileName);

            if(m.matches()){
                System.out.println("Файл типа: json");
            }
            else{
                System.out.println("Не верный ввод");
            }

        }

    }
}
