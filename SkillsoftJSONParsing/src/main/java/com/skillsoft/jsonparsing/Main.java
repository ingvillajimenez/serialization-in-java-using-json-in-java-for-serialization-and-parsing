package com.skillsoft.jsonparsing;

import org.json.CDL; // class CDL
import org.json.JSONArray; // class JSONArray
import org.json.JSONTokener; // class JSONTokener
import org.json.JSONObject; // class JSONObject

public class Main {

    public static void main(String[] args) {

        String commaDelimitedText = "name, age, gender \n" +
                "Peter, 42, male \n" +
                "Jane, 22, female \n" +
                "Ophelia, 25,  \n" +
                "Bob, 33, male";

        JSONArray array = CDL.toJSONArray(commaDelimitedText);

        System.out.println(array.toString(2));

        //[
        //  {
        //    "name": "Peter",
        //    "gender": "male",
        //    "age": "42"
        //  },
        //  {
        //    "name": "Jane",
        //    "gender": "female",
        //    "age": "22"
        //  },
        //  {
        //    "name": "Ophelia",
        //    "gender": "",
        //    "age": "25"
        //  },
        //  {
        //    "name": "Bob",
        //    "gender": "male",
        //    "age": "33"
        //  }
        //]

//        JSONArray headerArray = new JSONArray();
//
//        headerArray.put("name");
//        headerArray.put("age");
//        headerArray.put("gender");
//
//        String commaDelimitedText = "Peter, 42, male \n" +
//                "Jane, 22, female \n" +
//                "Ophelia, 25, null \n" +
//                "Bob, 33, male";
//
//        JSONArray array = CDL.toJSONArray(headerArray, commaDelimitedText);
//
//        System.out.println(array.toString(2));
        //[
        //  {
        //    "name": "Peter",
        //    "gender": "male",
        //    "age": "42"
        //  },
        //  {
        //    "name": "Jane",
        //    "gender": "female",
        //    "age": "22"
        //  },
        //  {
        //    "name": "Ophelia",
        //    "gender": "null",
        //    "age": "25"
        //  },
        //  {
        //    "name": "Bob",
        //    "gender": "male",
        //    "age": "33"
        //  }
        //]

//        JSONArray fieldsArray = CDL.rowToJSONArray(new JSONTokener(
//                "ID, LoanStatus, LoanAmount, Term, CreditScore, AnnualIncome, Home, CreditBalance"));
//
//        System.out.println(fieldsArray);
//        //["ID","LoanStatus","LoanAmount","Term","CreditScore","AnnualIncome","Home","CreditBalance"]
//
//        JSONObject loanJson1 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
//                "c89ed2cc, Fully Paid, 313544, Short Term, 716.0, 1353940.0, Home Mortgage, 195985"));
//
//        JSONObject loanJson2 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
//                "dbf1d5da, Charged Off, 342518, Long Term, 616.0, 1404195.0, Own Home, 621509"));
//        JSONObject loanJson3 = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
//                "bcbf02c0, Fully Paid, 176880, Short Term, 724.0, 668325.0, Rent, 342532"));
//
//        JSONObject loansJson = new JSONObject();
//        loansJson.append("loans", loanJson1);
//        loansJson.append("loans", loanJson2);
//        loansJson.append("loans", loanJson3);
//
//        System.out.println(loansJson.toString(2));
//        //{"loans": [
//        //  {
//        //    "LoanAmount": "313544",
//        //    "CreditBalance": "195985",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "c89ed2cc",
//        //    "Term": "Short Term",
//        //    "CreditScore": "716.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "1353940.0"
//        //  },
//        //  {
//        //    "LoanAmount": "342518",
//        //    "CreditBalance": "621509",
//        //    "LoanStatus": "Charged Off",
//        //    "ID": "dbf1d5da",
//        //    "Term": "Long Term",
//        //    "CreditScore": "616.0",
//        //    "Home": "Own Home",
//        //    "AnnualIncome": "1404195.0"
//        //  },
//        //  {
//        //    "LoanAmount": "176880",
//        //    "CreditBalance": "342532",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "bcbf02c0",
//        //    "Term": "Short Term",
//        //    "CreditScore": "724.0",
//        //    "Home": "Rent",
//        //    "AnnualIncome": "668325.0"
//        //  }
//        //]}

//        JSONArray fieldsArray = CDL.rowToJSONArray(new JSONTokener(
//                "ID, LoanStatus, LoanAmount, Term, CreditScore, AnnualIncome, Home, CreditBalance"));
//
//        System.out.println(fieldsArray);
//        //["ID","LoanStatus","LoanAmount","Term","CreditScore","AnnualIncome","Home","CreditBalance"]
//
//        JSONObject loadJson = CDL.rowToJSONObject(fieldsArray, new JSONTokener(
//                "c89ed2cc, Fully Paid, 313544, Short Term, 716.0, 1353940.0, Home Mortgage, 195985"));
//
//        System.out.println(loadJson.toString(2));
//        //{
//        //  "LoanAmount": "313544",
//        //  "CreditBalance": "195985",
//        //  "LoanStatus": "Fully Paid",
//        //  "ID": "c89ed2cc",
//        //  "Term": "Short Term",
//        //  "CreditScore": "716.0",
//        //  "Home": "Home Mortgage",
//        //  "AnnualIncome": "1353940.0"
//        //}

//        JSONObject studentsJson = new JSONObject();
//
//        JSONArray namesArray = CDL.rowToJSONArray(new JSONTokener("Peter, Jane, Bob, Nora, Hannah"));
//
//        studentsJson.put("names", namesArray);
//
//        System.out.println(studentsJson.toString(2));
//        //{"names": [
//        //  "Peter",
//        //  "Jane",
//        //  "Bob",
//        //  "Nora",
//        //  "Hannah"
//        //]}

//        JSONArray namesArray = CDL.rowToJSONArray(new JSONTokener("Peter, Jane, Bob, Nora, Hannah"));
//
//        System.out.println(namesArray);
//        //["Peter","Jane","Bob","Nora","Hannah"]
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

// CDL (Comma Delimited List)
// Convert comma-delimited values to a JSON array and vice-versa