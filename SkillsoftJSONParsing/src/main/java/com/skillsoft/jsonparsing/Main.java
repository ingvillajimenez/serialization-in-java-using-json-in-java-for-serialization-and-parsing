package com.skillsoft.jsonparsing;

import org.json.CDL; // class CDL
import org.json.JSONArray; // class JSONArray

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException
import java.nio.file.Files; // final class Files
import java.nio.file.Paths; // final class Paths

public class Main {

    public static void main(String[] args) throws IOException {

        String commaDelimitedLoans = new String(Files.readAllBytes(
                Paths.get("loans_with_header.csv")));

        JSONArray loansArray = CDL.toJSONArray(commaDelimitedLoans);

        System.out.println(loansArray.toString(2));
        //[
        //  {
        //    "LoanAmount": "313544",
        //    "CreditBalance": "195985",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "c89ed2cc",
        //    "Term": "Short Term",
        //    "CreditScore": "716.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "1353940.0"
        //  },
        //  {
        //    "LoanAmount": "216546",
        //    "CreditBalance": "236607",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "56eb2ec2",
        //    "Term": "Short Term",
        //    "CreditScore": "742.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "2244204.0"
        //  },
        //  {
        //    "LoanAmount": "359524",
        //    "CreditBalance": "552615",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "ecd98acd",
        //    "Term": "Long Term",
        //    "CreditScore": "691.0",
        //    "Home": "Own Home",
        //    "AnnualIncome": "2076510.0"
        //  },
        //  {
        //    "LoanAmount": "99999999",
        //    "CreditBalance": "237481",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "43611baf",
        //    "Term": "Short Term",
        //    "CreditScore": "745.0",
        //    "Home": "Rent",
        //    "AnnualIncome": "1277712.0"
        //  },
        //  {
        //    "LoanAmount": "349712",
        //    "CreditBalance": "265677",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "c5492dad",
        //    "Term": "Short Term",
        //    "CreditScore": "710.0",
        //    "Home": "Rent",
        //    "AnnualIncome": "1284210.0"
        //  },
        //  {
        //    "LoanAmount": "241626",
        //    "CreditBalance": "496033",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "7106fffa",
        //    "Term": "Long Term",
        //    "CreditScore": "660.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "738188.0"
        //  },
        //  {
        //    "LoanAmount": "201564",
        //    "CreditBalance": "307876",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "d7769953",
        //    "Term": "Short Term",
        //    "CreditScore": "741.0",
        //    "Home": "Rent",
        //    "AnnualIncome": "580260.0"
        //  },
        //  {
        //    "LoanAmount": "608542",
        //    "CreditBalance": "879263",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "b50fba9a",
        //    "Term": "Short Term",
        //    "CreditScore": "746.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "7883442.0"
        //  },
        //  {
        //    "LoanAmount": "511456",
        //    "CreditBalance": "579481",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "bb11d181",
        //    "Term": "Short Term",
        //    "CreditScore": "704.0",
        //    "Home": "Rent",
        //    "AnnualIncome": "1632442.0"
        //  },
        //  {
        //    "LoanAmount": "99999999",
        //    "CreditBalance": "499776",
        //    "LoanStatus": "Fully Paid",
        //    "ID": "570da3a0",
        //    "Term": "Short Term",
        //    "CreditScore": "733.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "2274756.0"
        //  },
        //  {
        //    "LoanAmount": "289476",
        //    "CreditBalance": "93746",
        //    "LoanStatus": "Charged Off",
        //    "ID": "2083c408",
        //    "Term": "Long Term",
        //    "CreditScore": "668.0",
        //    "Home": "Home Mortgage",
        //    "AnnualIncome": "945155.0"
        //  }
        //]

        try (FileWriter file = new FileWriter("loans_with_header.json")) {
            loansArray.write(file, 2, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        JSONArray headerArray = new JSONArray();
//
//        headerArray.put("ID");
//        headerArray.put("LoanStatus");
//        headerArray.put("LoanAmount");
//        headerArray.put("Term");
//        headerArray.put("CreditScore");
//        headerArray.put("AnnualIncome");
//        headerArray.put("Home");
//        headerArray.put("CreditBalance");
//
//        String commaDelimitedLoans = new String(Files.readAllBytes(Paths.get("loans.csv")));
//
//        JSONArray loansArray = CDL.toJSONArray(headerArray, commaDelimitedLoans);
//
//        System.out.println(loansArray.toString(2));
//        //[
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
//        //    "LoanAmount": "216546",
//        //    "CreditBalance": "236607",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "56eb2ec2",
//        //    "Term": "Short Term",
//        //    "CreditScore": "742.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "2244204.0"
//        //  },
//        //  {
//        //    "LoanAmount": "359524",
//        //    "CreditBalance": "552615",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "ecd98acd",
//        //    "Term": "Long Term",
//        //    "CreditScore": "691.0",
//        //    "Home": "Own Home",
//        //    "AnnualIncome": "2076510.0"
//        //  },
//        //  {
//        //    "LoanAmount": "99999999",
//        //    "CreditBalance": "237481",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "43611baf",
//        //    "Term": "Short Term",
//        //    "CreditScore": "745.0",
//        //    "Home": "Rent",
//        //    "AnnualIncome": "1277712.0"
//        //  },
//        //  {
//        //    "LoanAmount": "349712",
//        //    "CreditBalance": "265677",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "c5492dad",
//        //    "Term": "Short Term",
//        //    "CreditScore": "710.0",
//        //    "Home": "Rent",
//        //    "AnnualIncome": "1284210.0"
//        //  },
//        //  {
//        //    "LoanAmount": "241626",
//        //    "CreditBalance": "496033",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "7106fffa",
//        //    "Term": "Long Term",
//        //    "CreditScore": "660.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "738188.0"
//        //  },
//        //  {
//        //    "LoanAmount": "201564",
//        //    "CreditBalance": "307876",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "d7769953",
//        //    "Term": "Short Term",
//        //    "CreditScore": "741.0",
//        //    "Home": "Rent",
//        //    "AnnualIncome": "580260.0"
//        //  },
//        //  {
//        //    "LoanAmount": "608542",
//        //    "CreditBalance": "879263",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "b50fba9a",
//        //    "Term": "Short Term",
//        //    "CreditScore": "746.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "7883442.0"
//        //  },
//        //  {
//        //    "LoanAmount": "511456",
//        //    "CreditBalance": "579481",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "bb11d181",
//        //    "Term": "Short Term",
//        //    "CreditScore": "704.0",
//        //    "Home": "Rent",
//        //    "AnnualIncome": "1632442.0"
//        //  },
//        //  {
//        //    "LoanAmount": "99999999",
//        //    "CreditBalance": "499776",
//        //    "LoanStatus": "Fully Paid",
//        //    "ID": "570da3a0",
//        //    "Term": "Short Term",
//        //    "CreditScore": "733.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "2274756.0"
//        //  },
//        //  {
//        //    "LoanAmount": "289476",
//        //    "CreditBalance": "93746",
//        //    "LoanStatus": "Charged Off",
//        //    "ID": "2083c408",
//        //    "Term": "Long Term",
//        //    "CreditScore": "668.0",
//        //    "Home": "Home Mortgage",
//        //    "AnnualIncome": "945155.0"
//        //  }
//        //]
//
//        try (FileWriter file = new FileWriter("loans.json")) {
//            loansArray.write(file, 2, 0);
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

// CDL (Comma Delimited List)
// Convert comma-delimited values to a JSON array and vice-versa