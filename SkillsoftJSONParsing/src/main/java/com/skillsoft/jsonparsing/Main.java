package com.skillsoft.jsonparsing;

import org.json.JSONObject; // class JSONObject

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException

public class Main {

    public static void main(String[] args) {

        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", JSONObject.NULL);
        employeeJson.put("title", "Vice President");
        employeeJson.put("salary", 122000);

        System.out.println(employeeJson);
        //{"gender":null,"name":"Peter","title":"Vice President","salary":122000,"age":42}

        try (FileWriter file = new FileWriter("employee.json")) {
            employeeJson.write(file, 2, 0);
//            employeeJson.write(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/