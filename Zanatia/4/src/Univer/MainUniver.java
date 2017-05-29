package Univer;

import java.util.Random;

/**
 * Created by user on 29.05.2017.
 */
public class MainUniver {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        Random rand = new Random();
        for(int i = 0; i < student.length; i++){
            String name = "Студент " + String.valueOf(i);
            double oc = rand.nextInt(10) + rand.nextDouble();
            student[i] = new Student(rand.nextInt(20), name, oc, true );
        }
        System.out.println("Список студентов:");
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }
        System.out.println();
        PrintNameStudent(student[3]);

        System.out.println(Student.UniverRegistrV());
    }

    public static void PrintNameStudent(Student temp){
        System.out.println(temp.name);
    }
}
