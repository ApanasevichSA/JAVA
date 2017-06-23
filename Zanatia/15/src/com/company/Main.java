package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DataBase dataBase = null;
        if (true){
            MyFabrica fabrica = new SQLiteFabrica();
            dataBase = fabrica.getDataBase();
        }else {
            MyFabrica fabrica = new MSFabrica();
            dataBase = fabrica.getDataBase();
        }

        // дальше не важно с какой базай работаете

        dataBase.open();
        dataBase.getList();

        int n = 11;
        int [] mass = {1,4,5,3,1,4,5,7,7};
        System.out.println(chislo(mass));
    }

    static int chislo(int []temp){
        int k = temp[0];
        if(temp.length == 1){
            return temp[0];
        }
        int r = 0;
        for(int i = 0; i<temp.length;i++){
            r = r ^ temp[i];
        }

       // System.out.println(r);
//        Arrays.sort(temp);
//        for(int i = 0; i < temp.length; i+=2){
//            if(temp[i] != temp[i+1]){
//                return temp[i];
//            }
//        }
        return r;
    }
}
