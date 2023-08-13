package com.skillsoft.jsonparsing;

import org.json.JSONObject; // class JSONObject

import java.io.BufferedReader; // class BufferedReader
import java.io.FileReader; // class FileReader
import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException
import java.nio.file.Files; // final class Files
import java.nio.file.Paths; // final class Paths
import java.util.HashMap; // class HashMap
import java.util.Map; // interface Map

public class Main {

    public static void main(String[] args) throws IOException {

        String employeeString = new String(Files.readAllBytes(Paths.get("employee.json")));

        JSONObject employeeJson = new JSONObject(employeeString);

        String name = employeeJson.getString("name");
        double salary = employeeJson.getDouble("salary");

        JSONObject contactJson = employeeJson.getJSONObject("contact");

        String phone = contactJson.getString("phone");
        String email = contactJson.getString("email");

        System.out.format("\n%s, %s, %s, %.1f\n", name, phone, email, salary);
        //Peter, 212-555-3421, peter@gmail.com, 122000.0

//        JSONObject employeeJson = new JSONObject();
//
//        employeeJson.put("name", "Peter");
//        employeeJson.put("age", 42);
//        employeeJson.put("gender", JSONObject.NULL);
//        employeeJson.put("title", "Vice President");
//        employeeJson.put("salary", 122000);
//
//        JSONObject contactJson = new JSONObject();
//        contactJson.put("phone", "212-555-3421");
//        contactJson.put("email", "peter@gmail.com");
//        contactJson.put("address", "1234, 14th Street, New York, NY-10011");
//
//        employeeJson.put("contact", contactJson);
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": null,
//        //  "contact": {
//        //    "address": "1234, 14th Street, New York, NY-10011",
//        //    "phone": "212-555-3421",
//        //    "email": "peter@gmail.com"
//        //  },
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42
//        //}
//
//        try (FileWriter file = new FileWriter("employee.json")) {
//            employeeJson.write(file, 2, 0);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (BufferedReader reader = new BufferedReader(new FileReader("employee.json"))) {
//
//            StringBuilder stringBuilder = new StringBuilder();
//
//            String line = null;
//            String ls = System.getProperty("line.separator");
//
//            while ((line = reader.readLine()) != null) {
//                stringBuilder.append(line);
//                stringBuilder.append(ls);
//            }
//
//            JSONObject employeeJson = new JSONObject(stringBuilder.toString());
//
//            String name = employeeJson.getString("name");
//            String title = employeeJson.getString("title");
//
//            double salary = employeeJson.getDouble("salary");
//            int age = employeeJson.getInt("age");
//
//            System.out.format("\n%s, %s, %.1f, %d\n", name, title, salary, age);
//            //Peter, Vice President, 122000.0, 42
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String employeeString = "{" +
//                "\"name\":\"Peter\"," +
//                "\"age\":42," +
//                "\"gender\":null," +
//                "\"title\":\"Vice President\"," +
//                "\"salary\":122000" +
//                "}";
//        JSONObject employeeJson = new JSONObject(employeeString);
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "gender": null,
//        //  "name": "Peter",
//        //  "title": "Vice President",
//        //  "salary": 122000,
//        //  "age": 42
//        //}
//
//        try (FileWriter file = new FileWriter("employee.json")) {
//            employeeJson.write(file, 2, 0);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Map<String, String>  map = new HashMap<>();
//
//        map.put("name", "Peter");
//        map.put("title", "Vice President");
//        map.put("department", "Sales");
//
//        JSONObject employeeJson = new JSONObject(map);
//
//        System.out.println(employeeJson.toString(4));
//        //{
//        //    "name": "Peter",
//        //    "title": "Vice President",
//        //    "department": "Sales"
//        //}
//
//        try (FileWriter file = new FileWriter("employee.json")) {
//            employeeJson.write(file, 4, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/