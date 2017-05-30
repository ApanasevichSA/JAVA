package com.company;

/**
 * Created by Admin on 30.05.17.
 */
public class Patient {
    // поля
    private static int nextID = 345;  // id следующего больного
    public int id;     // id больного
    public String name;  // имя больного
    public int age;      // возраст больного
    public String diagnosis;  // диагноз больного
    public boolean isIll; // true - болеет; false - здоров

    // конструкторы
    public Patient(){
        name = null;
        age = 0;
        diagnosis = null;
        isIll = false;
        id = nextID;
        nextID++;
    }
    public Patient(String name, int age, String diagnosis, boolean isIll){
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.isIll = isIll;
        id = nextID;
        nextID++;
    }

    // методы
    public String toString(){
        return "Пациент " + name + " - Возраст " + age;
    }
    public static void searchName(Patient[] temp, String name){
        for(int i = 0; i < temp.length; i++){
            if (temp[i].name.equals(name)){
                System.out.println(temp[i]);
            }
        }
    }
    public static void searchAge(Patient[] temp, int age){
        for(int i = 0; i < temp.length; i++){
            if (temp[i].age == age){
                System.out.println(temp[i]);
            }
        }
    }
    public static void printPatient(Patient[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

}
