package com.skillsoft.jsonparsing;

import org.json.JSONTokener; // class JSONTokener

public class Main {

    public static void main(String[] args) {

        JSONTokener token = new JSONTokener("I solemnly swear, that I am up to no good");

        System.out.println(token.skipTo('w'));

        System.out.println(token.nextTo(','));

        System.out.println(token.nextTo('.'));

        //w
        //wear
        //, that I am up to no good

//        JSONTokener token = new JSONTokener("I solemnly swear that I am up to no good");
//
//        while (!token.end()) {
//            System.out.print(token.nextClean());
//            //IsolemnlyswearthatIamuptonogood 
//        }

//        JSONTokener token = new JSONTokener("I solemnly swear that I am up to no good");
//
//        while (token.more()) {
//            System.out.println(token.next(7));
//            //I solem
//            //nly swe
//            //ar that
//            // I am u
//            //p to no
//            //Exception in thread "main" org.json.JSONException: Substring bounds error at 40 [character 41 line 1]
//            //	at org.json.JSONTokener.syntaxError(JSONTokener.java:507)
//            //	at org.json.JSONTokener.next(JSONTokener.java:277)
//            //	at com.skillsoft.jsonparsing.Main.main(Main.java:12)
//        }

//        JSONTokener token = new JSONTokener("I solemnly swear that I am up to no good");
//
//        while (token.more()) {
//            System.out.println(token.next(5));
//            //I sol
//            //emnly
//            // swea
//            //r tha
//            //t I a
//            //m up
//            //to no
//            // good
//        }

//        JSONTokener token = new JSONTokener("I solemnly swear that I am up to no good");
//
//        while (token.more()) {
//            System.out.println(token.next());
//            //I
//            //
//            //s
//            //o
//            //l
//            //e
//            //m
//            //n
//            //l
//            //y
//            //
//            //s
//            //w
//            //e
//            //a
//            //r
//            //
//            //t
//            //h
//            //a
//            //t
//            //
//            //I
//            //
//            //a
//            //m
//            //
//            //u
//            //p
//            //
//            //t
//            //o
//            //
//            //n
//            //o
//            //
//            //g
//            //o
//            //o
//            //d
//        }

    }
}

//JSON-Java or org.json
//Popular, easy to use, powerful Java library for reading and writing JSON

//Search the Maven Repository
//https://search.maven.org/classic/

// JSONTokener
// Takes in a string and extracts characters and tokens from the string