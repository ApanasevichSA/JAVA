package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        UI ui = new UI();
//        ui.startUI();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMM dd'e', hh:mm aaa");
        String strTime = sdf.format(date);

        System.out.println(strTime);
    }
}
