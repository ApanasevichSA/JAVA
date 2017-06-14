package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashMap<String, Student> hash = new HashMap<>();

        hash.put("by", new Student("AAA",21));
        hash.put("ru", new Student("BBB",18));
        hash.put("en", new Student("CCC",19));

        System.out.println(hash.toString());

        System.out.println(hash.get("by"));

        for(String key: hash.keySet()){
            System.out.println("key = " + key + " name = " + hash.get(key).getName() + " age = " + hash.get(key).getAge());
        }

        HashMap<Counter, Student> hash1 = new HashMap<>();

        hash1.put(new Counter("by"), new Student("AAA",21));
        hash1.put(new Counter("ru"), new Student("BBB",18));
        hash1.put(new Counter("en"), new Student("CCC",19));

        System.out.println(hash1.toString());

        System.out.println(hash1.get("by"));

        for(Counter key: hash1.keySet()){
            System.out.println("key = " + key.getName() + " name = " + hash1.get(key).getName() + " age = " + hash1.get(key).getAge());
        }
        String name = hash1.get(new Counter("ru")).getName();
        System.out.println(name);

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("AAA",21));
        list.add(new Student("BBB",20));
        list.add(new Student("CCC",19));

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("sdafasd",23));
        list1.add(new Student("asdfas",42));
        list1.add(new Student("sdaf",24));

        HashMap<Counter, ArrayList<Student>> hashMap = new HashMap<>();
        hashMap.put(new Counter("en"),list);
        hashMap.put(new Counter("ru"),list1);

        System.out.println(hashMap);

        System.out.println("**************************************************************************");

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("ZZZ",221));
        list2.add(new Student("DDD",2230));
        list2.add(new Student("CCC",19));
        list2.add(new Student("AAA",3458));
        System.out.println(list2);

        // Collections.sort(list2); // работает с интерфейсом
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(list2);


        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() > o2.getAge()){
                    return 1;
                }
                else if (o1.getAge() == o2.getAge()){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        });

        System.out.println(list2);
    }
}
