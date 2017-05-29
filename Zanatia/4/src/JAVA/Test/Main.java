package JAVA.Test;

import Zan4.Test2;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Test1 test = new Test1(6);
        test.PrintA();

        test.a = 7;
        test.PrintA();


        System.out.println(test);
        Test1 test2 = new Test1(6);
        System.out.println(test2);
        Test1 test3 = new Test1(6);
        System.out.println(test3);
        test.a = 78;
        test2.a = 56;
        test3.a = 78;
        System.out.println();
        System.out.println(test);
        System.out.println(test2);
        Test1.c = 6666666;
        System.out.println(test3);

        }
}
