/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Throwable;
/**
 *
 * @author Администратор
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        String  operacia, deistvie;
        do{
            System.out.println("Для продолжения работы введеите: Next. Для завершение: Close ");
            deistvie = reader.readLine();
            if (deistvie.equals("Next")){
                System.out.println("Введите число:");
                try{
                    a = Integer.parseInt(reader.readLine());
                    System.out.println("Введите действие: + - * / %");
                    operacia = reader.readLine();
                    System.out.println("Введите число:");
                    b = Integer.parseInt(reader.readLine());
                }
                catch(Throwable t){
                    System.out.println("Ошибка ввода!!! Программа завершает работу!!!");    
                    break;  
                   // continue; // для продолжения работы 
                }
                if (operacia.equals("+")){
                    c = a + b;
                    System.out.println(a + " " + operacia + " " + b + " = " + c);
                } else if (operacia.equals("-")){
                    c = a - b;
                    System.out.println(a + " " + operacia + " " + b + " = " + c);
                } else if (operacia.equals("*")){
                        c = a * b;
                        System.out.println(a + " " + operacia + " " + b + " = " + c);
                }else if (operacia.equals("/")){
                    try{
                    c = a / b;
                    System.out.println(a + " " + operacia + " " + b + " = " + c);
                    }
                    catch(Throwable t){
                        System.out.println("Делеение на ноль. Программа завершает работу!!!");
                        break;
                        // continue; // для продолжения работы 
                    }
                }else if (operacia.equals("%")){
                    try{
                        c = a % b;
                        System.out.println(a + " " + operacia + " " + b + " = " + c);
                    }
                    catch(Throwable t){
                        System.out.println("Делеение на ноль. Программа завершает работу!!!");
                        break;
                        // continue; // для продолжения работы 
                    }
                }else{
                    System.out.println("Операция введена не коректно!!!");
                }
                
            } else if (deistvie.equals("Close")){
                System.out.println("Работа завершена");
                break;
            }
            
        }while(true);
        
    }
      
}
