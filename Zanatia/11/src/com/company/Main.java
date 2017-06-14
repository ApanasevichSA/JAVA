package com.company;

import java.util.*;

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


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("5","пять");
        hashMap.put("7","семь");
        hashMap.put("6","шесть");
        hashMap.put("20","FFFFF");
        hashMap.put("0","00000");
        hashMap.put("0","11111");

        System.out.println(hashMap.toString());
        System.out.println(hashMap.get(0));

        for(String key: hashMap.keySet()){
            System.out.println("key = " + key + " value = " + hashMap.get(key));
        }


    }
}
