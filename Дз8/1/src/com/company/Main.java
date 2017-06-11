package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива:");
        int n = Integer.parseInt(reader.readLine());
        Student[] student = inputStudent(n);
        System.out.println("Список студентов");
        printStudent(student);
        System.out.println();
        averageAgeStudent(student);


    }

    // метод заполнения массива
    public static Student[] inputStudent(int n) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student[] student = new Student[n];
        for(int i = 0; i < student.length; i++){
            System.out.println("Введите имя:");
            String firstName = reader.readLine();
            System.out.println("Введите фамилию:");
            String lastName = reader.readLine();
            System.out.println("Введите дату рождения в формате: дд.мм.гггг");
            String date = reader.readLine();  // дата в строке
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd.MM.yyyy");  // формат даты
            Date dateBirth = format.parse(date); // страку в дату
            student[i] = new Student(lastName, firstName, dateBirth);
        }
        return student;
    }

    // метод вывода массива
    public static void printStudent(Student[] student){
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }
    }

    // метод нахождения среднего возраста студентов
    public static void averageAgeStudent(Student[] student){
        Date date = new Date();
        int yare = 0;
        int monte = 0;
        for(int i = 0; i < student.length; i++){
            SimpleDateFormat fYare = new SimpleDateFormat("yyyy");
            SimpleDateFormat fMonte = new SimpleDateFormat("MM");
            yare += (Integer.parseInt(fYare.format(date))-Integer.parseInt(fYare.format(student[i].getDateBirth())));
            monte += (12 - Integer.parseInt(fMonte.format(student[i].getDateBirth())) + Integer.parseInt(fMonte.format(date))) % 12;
        }
        monte /= student.length;
        yare /= student.length;
        System.out.println(yare + " " + printYare(yare) + " " + monte + " " + printMonte(monte));
    }

    // метод печати названия лет
    public static String printYare(int yare){
        if (yare % 100 /10 == 1){
            return  " лет";
        }
        else{
            switch (yare % 10){
                case 1:{
                    return " год";
                }
                case 2:
                case 3:
                case 4:{
                    return  " года";
                }
                default:
                    return  " лет";
            }
        }
    }

    // метод печати названия лет
    public static String printMonte(int monte){
             switch (monte % 10){
                case 1:{
                    return " месяц";
                }
                case 2:
                case 3:
                case 4:{
                    return  " месяца";
                }
                default:
                    return  " месяцев";

        }
    }
}
