package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> list = new ArrayList<>();
        list.add("первый");
        list.add("второй");
        list.add("третий");

        System.out.println(list.toString());
        System.out.println("Размер листа " + list.size());

        list.add("четверты");

        System.out.println(list.toString());
        System.out.println("Размер листа " + list.size());

        list.add(0,"пятый");

        System.out.println(list.toString());
        System.out.println("Размер листа " + list.size());
        System.out.println("Элемент под индексом 2: " + list.get(2));

        for( String text: list){
            System.out.println(text.length());
        }

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(5);
        listInt.add(2);
        listInt.add(5);
        listInt.add(3);
        listInt.add(5);
        System.out.println(listInt.toString());
        int n = listInt.size()-1;
        while (n>=0){
            if (listInt.get(n) == 5){
                listInt.remove(n);
            }
            n--;

        }
        System.out.println(listInt.toString());

//        ArrayList<Integer> infdd = new ArrayList<>();
//        infdd.add(5);
//        listInt.removeAll(infdd);

        LinkedList<Integer> linkedList = new LinkedList<>();
        listInt.add(1);
        listInt.add(5);
        listInt.add(2);
        listInt.add(5);
        listInt.add(3);
        listInt.add(5);
        System.out.println(listInt.toString());

        ArrayList<Integer> infdd = new ArrayList<>();
        infdd.add(5);
        listInt.removeAll(infdd);

        System.out.println(listInt.toString());
    }
}
