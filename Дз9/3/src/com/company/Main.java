package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество проспектов в городе:");
        int avenue = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество улиц в городе:");
        int street = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество площадей в городе:");
        int place = Integer.parseInt(reader.readLine());
        City city = new City(avenue, street, place);
    }
}
