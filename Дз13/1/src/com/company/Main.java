package com.company;




import org.codehaus.jackson.map.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Root root = parseJackson("test.json");
        System.out.println(root.toString());

    }

    public static Root parseJackson(String path) throws IOException {

        Root root = null;
        ObjectMapper mapper = new ObjectMapper();
        root = mapper.readValue(new File(path),Root.class);
        return root;
    }
}
