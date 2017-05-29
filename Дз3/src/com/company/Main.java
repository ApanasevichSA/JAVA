package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int[] A = new int[10];
        A = InputArrayK(10);
        System.out.println("Исходный массив:");
        OutputArray(A);
        A = SelectionSort(A);
        System.out.println("Упорядоченный массив:");
        OutputArray(A);
        System.out.println("Четные элементы массива:");
        ChetElArray(A);
    }
    // метод ввода данных в массив с клавиатуры
    public static int[] InputArrayK(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] Temp = new int[n];
        for(int i = 0; i < Temp.length; i++){
            System.out.printf("Введите А[%1d]: ",i);
            Temp[i] = Integer.parseInt(reader.readLine());
        }
        return Temp;
    }
    // метод вывода данных из массива
    public static void OutputArray(int[] Temp){
        for(int i = 0; i < Temp.length; i++){
            System.out.print(Temp[i] + "|");
        }
        System.out.println();
    }
    // сортировка выбором
    public static int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
    // нахождение четных чисел
    public static void ChetElArray(int[] Temp){
        for(int i = 0; i < Temp.length; i++){
            if (Temp[i] % 2 == 0){
                System.out.print(Temp[i] + "|");
            }
        }
        System.out.println();
    }
}
