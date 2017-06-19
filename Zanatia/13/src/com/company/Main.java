package com.company;

import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here

//        Root root = parseJSON("test.json");
//        System.out.println(root.toString());

        Root root = parseGson("test.json");
        System.out.println(root.toString());

    }

    public static  Root parseJSON(String path) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        Root root = null;
        JSONObject rootObject = (JSONObject)parser.parse(new FileReader(path));
        root = new Root();
        root.setName((String)rootObject.get("name"));

        System.out.println("Name: " + root.getName());

        ArrayList<People>  peoples = new ArrayList<>();
        JSONArray peopleArray = (JSONArray)rootObject.get("people");

        for(Object item: peopleArray){
            JSONObject itemObj = (JSONObject)item;

            int id = (int)(long)itemObj.get("id");
            String name = (String)itemObj.get("name");
            String surname = (String)itemObj.get("surname");
            int age = (int)(long)itemObj.get("age");
            boolean isDegree = (boolean)itemObj.get("isDegree");
//
            peoples.add(new People(age,id,isDegree,name,surname));


        }

        root.setPeople(peopleArray);

        return root;
    }

    public static Root parseGson(String path){
        Root root = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));

            Gson gson = new Gson();
            root = gson.fromJson(reader,Root.class);
        } catch (Exception e){
            System.out.println("Ошибка открытия файла " + path);
        }
        return root;
    }

}
