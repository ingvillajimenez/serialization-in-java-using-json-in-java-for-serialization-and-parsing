package com.skillsoft.jsonparsing;

import org.json.JSONArray; // class JSONArray
import org.json.JSONObject; // class JSONObject

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException

public class Main {

    public static void main(String[] args) {

        JSONObject employeeJson = new JSONObject();

        employeeJson.put("name", "Peter");
        employeeJson.put("age", 42);
        employeeJson.put("gender", "Male");
        employeeJson.put("title", "Vice President");
        employeeJson.put("salary", 122000);

        employeeJson.append("email", "peter.piper@gmail.com");
        employeeJson.append("email", "peter@shawco.com");
        employeeJson.append("email", "peter@hotmail.com");

        System.out.println(employeeJson.toString(2));
        //{
        //  "gender": "Male",
        //  "name": "Peter",
        //  "title": "Vice President",
        //  "salary": 122000,
        //  "age": 42,
        //  "email": [
        //    "peter.piper@gmail.com",
        //    "peter@shawco.com",
        //    "peter@hotmail.com"
        //  ]
        //}

        try (FileWriter file = new FileWriter("employee.json")) {
            employeeJson.write(file, 2, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        employeeJson.append("email", "peter.piper@gmail.com");
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": ["peter.piper@gmail.com"]
//        //}

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        employeeJson.accumulate("email", "peter.piper@gmail.com");
//        employeeJson.accumulate("email", "peter@shawco.com");
//        employeeJson.accumulate("email", "peter@hotmail.com");
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": [
//        //    "peter.piper@gmail.com",
//        //    "peter@shawco.com",
//        //    "peter@hotmail.com"
//        //  ]
//        //}

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        employeeJson.accumulate("email", "peter.piper@gmail.com");
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": "peter.piper@gmail.com"
//        //}

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        employeeJson.put("email", "peter.piper@gmail.com");
//        employeeJson.put("email", "peter@shawco.com");
//        employeeJson.put("email", "peter@hotmail.com");
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": "peter@hotmail.com"
//        //}

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        employeeJson.put("email", "peter.piper@gmail.com");
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": "peter.piper@gmail.com"
//        //}

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", "Male");
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        JSONArray emailArray = new JSONArray();
//        emailArray.put("peter.piper@gmail.com");
//        emailArray.put("peter@shawco.com");
//
//        employeeJson.put("email", emailArray);
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": "Male",
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42,
//        //  "email": [
//        //    "peter.piper@gmail.com",
//        //    "peter@shawco.com"
//        //  ]
//        //}

    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/