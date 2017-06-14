/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;
import java.io.BufferedReader;

/**
 *
 * @author Администратор
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException{
        // TODO code application logic here
        System.out.println("Задача 3");
        
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMMM dd'e', hh:mm aaa");
        String strTime = sdf.format(date);

        System.out.println(strTime);
        System.out.println("Задача 4");
        //Необходимо конвертировать дату из строки в объект Date. Тоесть сроку вида: 
       // “2017-06-05 20:25” необходимо конвертировать в объект Date.
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату рождения в формате: гггг-мм-дд чч:мм");
        String date1 = reader.readLine();  // дата в строке
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd hh:mm");  // формат даты
        Date dateBirth = format.parse(date1); // страку в дату
        System.out.println(date1);
        
    }
    
}
