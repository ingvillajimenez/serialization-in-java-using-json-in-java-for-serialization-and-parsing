package com.skillsoft.jsonparsing;

import org.json.JSONArray; // class JSONArray
import org.json.JSONObject; // class JSONObject

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException
import java.nio.file.Files; // final class Files
import java.nio.file.Paths; // final class Paths

public class Main {

    public static void main(String[] args) throws IOException {

        String employeeString = new String(Files.readAllBytes(Paths.get("employees.json")));

        JSONArray employeesJson = new JSONArray(employeeString);

        for (int i = 0; i < employeesJson.length(); i++) {

            JSONObject employeeJson = employeesJson.getJSONObject(i);

            String name = employeeJson.getString("name");
            String title = employeeJson.getString("title");
            double salary = employeeJson.getDouble("salary");

            System.out.format("\n***\n%s, %s, %.1f\n", name, title, salary);
            //***
            //Peter, Vice President, 122000.0
            //***
            //Donna, Tech Lead, 108000.0

            int age = employeeJson.optInt("age");
            String gender = employeeJson.optString("gender");

            System.out.format("%d, %s\n", age, gender);
            //42,
            //0,
        }

//        JSONObject employeeJson1 = new JSONObject();
//
//        employeeJson1.put("name", "Peter");
//        employeeJson1.put("age", 42);
//        employeeJson1.put("gender", JSONObject.NULL);
//        employeeJson1.put("title", "Vice President");
//        employeeJson1.put("salary", 122000);
//
//        JSONObject employeeJson2 = new JSONObject();
//
//        employeeJson2.put("name", "Donna");
//        employeeJson2.put("title", "Tech Lead");
//        employeeJson2.put("salary", 108000);
//
//        JSONArray employeesArray = new JSONArray();
//        employeesArray.put(employeeJson1);
//        employeesArray.put(employeeJson2);
//
//        System.out.println(employeesArray.toString(2));
//        //[
//        //  {
//        //    "gender": null,
//        //    "name": "Peter",
//        //    "title": "Vice President",
//        //    "salary": 122000,
//        //    "age": 42
//        //  },
//        //  {
//        //    "name": "Donna",
//        //    "title": "Tech Lead",
//        //    "salary": 108000
//        //  }
//        //]
//
//        try (FileWriter file = new FileWriter("employees.json")) {
//            employeesArray.write(file, 2, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/