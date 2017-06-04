package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         *  —делать задание с массивами и System.arraycopy. —оздать массив из 10 переменных любого типа данных.
         *  —оздать другой массив с 20-ю переменными такого же типа данных, как и первый.
         ƒалее скопировать первый массив во второй в середину.
         ѕример:
         [1,1,1,1,1,1,1,1,1,1]
         »тоговый массив должен быть:
         [0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0]

         */
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] B = new int[20];
        System.arraycopy(A,0,B,5,A.length);
        outpupArray(A);
        outpupArray(B);
    }

    public static void outpupArray(int[] temp){
        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
