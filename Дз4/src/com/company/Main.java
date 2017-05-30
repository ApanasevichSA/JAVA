package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество пациентов");
        int n = Integer.parseInt(reader.readLine());
        Patient[] patients = new Patient[n];
        for(int i = 0; i < patients.length; i++){
            System.out.println("Введите имя пациента:");
            String name = reader.readLine();
            System.out.println("Введите возраст пациента:");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Введите диагноз пациента:");
            String diagnosis = reader.readLine();
            patients[i] = new Patient(name, age, diagnosis, true);
        }
        System.out.println("Пациенты:");
        Patient.printPatient(patients);
        System.out.println();
        System.out.println("Введите имя для поиска:");
        String nam = reader.readLine();
        Patient.searchName(patients, nam);
        System.out.println("Введите возраст для поиска:");
        int ag = Integer.parseInt(reader.readLine());
        Patient.searchAge(patients, ag);
    }
}
