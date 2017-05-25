package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        1. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее
        и наибольшее значение в массиве.
        min value =  "значение которое у вас получилось".
        max value =  "значение которое у вас получилось".
        Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив
        на экран в виде:
        [23, 0, 34, 99, 43534].
         */
        System.out.println("Задача №1");
        Random rand = new Random();
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(300);
        }
        System.out.println("Исходный массив:");
        System.out.print("[");
        for(int i = 0; i < a.length-1; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1] + "]");
        int minI = 0, maxI = 0;
        for (int i = 0; i < a.length;i++){
            if (a[i] > a[maxI]){
                maxI = i;
            }
            else if (a[i] < a[minI]){
                minI = i;
            }
        }
        System.out.println("min value = " + a[minI]);
        System.out.println("max value = " + a[maxI]);
        a[maxI] = 99;
        a[minI] = 0;
        System.out.println("Измененный массив:");
        System.out.print("[");
        for(int i = 0; i < a.length-1; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1] + "]");

        System.out.println();
        /*
        2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
        Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
        В результате выполнения программы на экран должно вывести:
        [3] - повторений 2
        [7] - повторений 3
         */
        System.out.println("Задача №2");
        float[] b = new float[10];
        for(int i = 0; i < b.length; i++){
            b[i] = rand.nextInt(5);
        }
        System.out.println("Исходный массив:");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < b.length;i++){
            int count = 1;
            boolean flag = true; // знчение текущего элемента не сравнивали
            for(int j = 0; j < i-1; j++){
                if (b[i] == b[j]){
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                break;
            }
            for(int z = i+1; z < b.length; z++ ){
                if (b[i] == b[z]){
                    count++;
                }
            }
            if (count > 1){
                System.out.printf("[%1f] - повторений %2d\n", b[i], count);
            }
        }

        System.out.println();
        /*
        3. Напишите программу, которая печатает массив, затем инвертирует (то есть
        меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
        */
        System.out.println("Залача №3");
        int[] c = new int[10];
        for(int i = 0; i < c.length; i++){
            c[i] = rand.nextInt(30);
        }
        System.out.println("Исходный массив:");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
        int len = a.length;
        for(int i = 0; i < c.length / 2; i++){
            int buf = c[i];
            c[i] = c[len - i - 1];
            c[len - i - 1] = buf;
        }
        System.out.println("Измененный массив");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        System.out.println();
        /*
        4. Задание не обязательное, для тех кто все сделал и все понимает:
        Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию).
        Результат вывести на экран.
         */
        System.out.println("Залача №4");
        int[] d = new int[10];
        for(int i = 0; i < d.length; i++){
            d[i] = rand.nextInt(30);
        }
        System.out.println("Исходный массив:");
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();
        Arrays.sort(d);
        System.out.println("Измененный массив:");
        for(int i = 0; i < d.length; i++){
            System.out.print(d[i] + " ");
        }
        System.out.println();

    }
}
