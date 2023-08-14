package com.skillsoft.jsonparsing;

import org.json.JSONObject; // class JSONObject
import org.json.JSONArray; // class JSONArray

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException
import java.math.BigInteger; // class BigInteger
import java.util.ArrayList; // class ArrayList
import java.util.List; // interface List

public class Main {

    public static void main(String[] args) {

        EmployeeBean employeeBean1 = new EmployeeBean(
                BigInteger.valueOf(1234567), "John", "Business Analyst", 56000, 28);

        EmployeeBean employeeBean2 = new EmployeeBean();
        employeeBean2.setId(BigInteger.valueOf(3451230));
        employeeBean2.setName("Julia");
        employeeBean2.setTitle("Vice President");
        employeeBean2.setAge(35);

        EmployeeBean employeeBean3 = new EmployeeBean();
        employeeBean3.setId(BigInteger.valueOf(5555));
        employeeBean3.setName("Doris");

        List<EmployeeBean> list = new ArrayList<>();
        list.add(employeeBean1);
        list.add(employeeBean2);
        list.add(employeeBean3);

        JSONArray jsonArray = new JSONArray(list);

        System.out.println(jsonArray.toString(2));
        //[
        //  {
        //    "name": "John",
        //    "id": 1234567,
        //    "title": "Business Analyst",
        //    "salary": 56000,
        //    "age": 28
        //  },
        //  {
        //    "name": "Julia",
        //    "id": 3451230,
        //    "title": "Vice President",
        //    "salary": 0,
        //    "age": 35
        //  },
        //  {
        //    "name": "Doris",
        //    "id": 5555,
        //    "salary": 0,
        //    "age": 0
        //  }
        //]

//        EmployeeBean employeeBean = new EmployeeBean(
//                BigInteger.valueOf(1234567), "John", "Business Analyst", 56000, 28);
//
//        JSONObject employeeJson = new JSONObject(employeeBean);
//
//        System.out.println(employeeJson.toString(2));
//        //{
//        //  "name": "John",
//        //  "id": 1234567,
//        //  "salary": 56000,
//        //  "title": "Business Analyst",
//        //  "age": 28
//        //}
//
//        try (FileWriter file = new FileWriter("employee.json")) {
//            employeeJson.write(file, 2, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/

// JSONTokener
// Takes in a string and extracts characters and tokens from the string

// Beans
// Classes that encapsulate many objects into a single object

// Beans
// Serializable, zero-argument constructor, getter and setter methods to access properties

// Reflection on Getters
// Any no-argument method which starts with "get" or "is" followed by an uppercase letter