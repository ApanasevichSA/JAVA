package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Date date = new Date();
       /* System.out.println(date);
        System.out.println(date.getTime());

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println(cal.get(GregorianCalendar.DATE));
        System.out.println(cal.get((GregorianCalendar.MARCH)));
        System.out.println(cal.get(GregorianCalendar.YEAR));

        cal.add(GregorianCalendar.DATE, 45);

        System.out.println(cal.get(GregorianCalendar.DATE));
        System.out.println(cal.get((GregorianCalendar.MONTH))+1);
        System.out.println(cal.get(GregorianCalendar.YEAR));*/

        SimpleDateFormat sf = new SimpleDateFormat();
        sf.applyPattern("K:mm a, z");
        String dataString =  sf.format(date);
        System.out.println(dataString);
    }
}
