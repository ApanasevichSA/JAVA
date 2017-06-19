package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Задача №1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        do {
            System.out.println("Введите слово. Для завершения ввода введите: Close");
            String str = reader.readLine();
            if (str.equals("Close")) {
                System.out.println("Ввод завершен!!!");
                break;
            }
            arrayList.add(str);
        } while (true);
        System.out.println("Содержимое коллекции:");
        System.out.println(arrayList.toString());

        System.out.println("Задача №2");
        int i = 0;
        while (i < arrayList.size()) {
            String s = arrayList.get(i);
            s = removeChar(s, 'a');
            arrayList.remove(i);
            arrayList.add(i, s);
            i++;
        }
        System.out.println("Коллекция без букв 'a':");
        System.out.println(arrayList.toString());

        System.out.println("Задача №3");

        ArrayList<Piople> arrayMen = new ArrayList<>();
        do {
            System.out.println("Введите три слова: Имя, очество, фамилия (мужские). Для завершения ввода введите: Close");
            String name = reader.readLine();
            String otch = reader.readLine();
            String fam = reader.readLine();
            if (name.equals("Close") || otch.equals("Close") || fam.equals("Close")) {
                System.out.println("Ввод завершен!!!");
                break;
            }
            arrayMen.add(new Piople(name, otch, fam));
        } while (true);

        ArrayList<Piople> arrayWomen = new ArrayList<>();
        do {
            System.out.println("Введите три слова: Имя, очество, фамилия (женские). Для завершения ввода введите: Close");
            String name = reader.readLine();
            String otch = reader.readLine();
            String fam = reader.readLine();
            if (name.equals("Close") || otch.equals("Close") || fam.equals("Close")) {
                System.out.println("Ввод завершен!!!");
                break;
            }
            arrayWomen.add(new Piople(name, otch, fam));
        } while (true);

        HashMap<String, ArrayList<Piople>> hashMap = new HashMap<>();
        hashMap.put("men", arrayMen);
        hashMap.put("women", arrayWomen);
        System.out.println("Содержимое HashMap");
        System.out.println(hashMap.toString());

        System.out.println("Введите men или women, для просмотра случайнолго ФИО");
        String fio = reader.readLine();
        Random rand = new Random();
        if (fio.equals("men") || fio.equals("women")){
            int k = rand.nextInt(hashMap.get(fio).size());
            System.out.println(hashMap.get(fio).get(k));
        }
        else{
            System.out.println("Не верный ввод!!!");
        }

    }

    // метод удаления всех вхождений указаного символа
    public static String removeChar(String s, char c) {
        String r = "";
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != c) r += s.charAt(i);
        }
        return r;

    }
}
