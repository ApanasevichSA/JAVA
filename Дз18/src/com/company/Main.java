package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IOException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
	// write your code here
        Test test = new Test("Привет", 5, 1.2f);
        System.out.println("Начальное значение полей:");
        System.out.println(test);

        System.out.println("Иследование полей на имя и тип:");
        Field[] field = test.getClass().getDeclaredFields();
        for(Field fiel: field){
            Class fieldType = fiel.getType();
            System.out.println("Имя: " + fiel.getName());
            System.out.println("Тип: " + fieldType.getName());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(Field fiel: field){
            Class fieldType = fiel.getType();
            if (fieldType.getName().equals("int")){
                System.out.println("Введите целое числе для записи в переменную: " + fiel.getName());
                int n = Integer.parseInt(reader.readLine());
                fiel.setAccessible(true);
                fiel.setInt(test, n);
            } else if (fieldType.getName().equals("float")){
                System.out.println("Введите числе (флоат) для записи в переменную: " + fiel.getName());
                float n = Float.parseFloat(reader.readLine());
                fiel.setAccessible(true);
                fiel.setFloat(test, n);
            }else if (fieldType.getName().equals("java.lang.String")) {
                System.out.println("Введите слово для записи в переменную: " + fiel.getName());
                String s = reader.readLine();
                fiel.setAccessible(true);
                fiel.set(test, s);
            }
        }
        System.out.println("Значение полей посде изменения:");
        System.out.println(test);

        System.out.println("Иследование методов на имя и возвращаемый тип:");
        Class c = test.getClass();
        Method[] methods = c.getMethods();
        for(Method met: methods){
            System.out.println("Имя: " + met.getName());
            System.out.println("Возвращаемый тип: " + met.getReturnType().getName());
        }

        System.out.println("Вызов геторов");
        for(int i = 0; i < 3; i++){
            Method m = c.getMethod(methods[i].getName(),null);
            System.out.println(m.invoke(test));
        }
    }
}
