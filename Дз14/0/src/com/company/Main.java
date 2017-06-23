package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "2017 АВ-7";
        Pattern p = Pattern.compile("[0-9]{4}\\s[А-Я]{2}-[0-7]{1}");
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("Номер верный");
        }
        else{
            System.out.println("Номер не верный");
        }

        Pattern e = Pattern.compile("\\w+@[a-zA-Z_0-9]+\\.[a-zA-Z]{2,4}");
        System.out.println("Введите email:");
        text = reader.readLine();
        m = e.matcher(text);

        if(m.matches()){
            System.out.println("email верный");
        }
        else{
            System.out.println("email не верный");
        }



    }
}
