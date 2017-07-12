package com.company;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.net.URL;

/**
 * Created by user on 12.07.2017.
 */
public class Convert  extends Root {
    private OnConvertListener listener; // переменная интерфейcа
    private Root root;

    public Convert() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // скачать файл для парсинга
        String url = "http://kiparo.ru/t/currency.json";
        try {
            // качаем файл с помощью Stream
            downloadUsingStream(url, "currency.json");
        } catch (IOException e) {
            listener.onConvert(4);
        }

        // парсинг документа и вывод информации на кансоль
        Manny pp = new Manny();
        System.out.println(pp.nameCurrency);
        root = null;
        System.out.println("Для сортировки по имени валюты введите Yes");
        String sotring = reader.readLine();
        if (sotring.equals("Yes")){
            printValuta(true);
        }else{
            printValuta(false);
        }


    }
    public void setListener(OnConvertListener listener) {
        this.listener = listener;
    }
    // метод проверки наличия валюту (вернет true - есть валюта, false - нет валюты
    public boolean isCurrency(String name) {
        for(Manny i: root.getCurrency()){
            if(i.getName().equals(name)){
                listener.onConvert(3);
                return i.isVisible();
            }
        }
        listener.onConvert(2);
        return false;
    }

    // метод проверки кооректного ввода имени валюты
    public boolean isVisableVal(String name){

        return false;
    }
    // метод перевода валюты, вернет полученную сумму
    public double convertVal(String ishName, String convertName, int sum){
        double cursIsh = cursCurrency(ishName);
        double cursConvert = cursCurrency(convertName);
        double convertSum = (sum * cursIsh) / cursConvert;
        listener.onConvert(1);
        return convertSum;
    }

    // метод возвращает курс по названию
    private double cursCurrency(String name){
        for(Manny i: root.getCurrency()){
            if(i.getName().equals(name)){
                return i.getRate();
            }
        }
        return 0;
    }
    // метод вывода валют
    public void printValuta(boolean sortVal){

        try {
            root = parseJackson("currency.json");
        } catch (IOException e) {
            System.out.println("Файл с данными о валюте недоступен");
        }
        if (sortVal){
            //root.setCurrency(Arrays.sort(root.getCurrency()));
            Collections.sort(root.getCurrency(), new Comparator<Manny>() {
                @Override
                public int compare(Manny o1, Manny o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        System.out.println(root.toString());
        System.out.println(root.getCurrency());


    }
    // прасинг файла
    public  Root parseJackson(String path) throws IOException {

        root = null;
        ObjectMapper mapper = new ObjectMapper();
        root = mapper.readValue(new File(path),Root.class);
        return root;
    }

    // качаем файл с помощью Stream
    private static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }
}
