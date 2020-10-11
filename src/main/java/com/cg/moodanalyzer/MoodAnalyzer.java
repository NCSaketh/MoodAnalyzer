package com.cg.moodanalyzer;

import java.util.Scanner;

import java.util.Scanner;

public class MoodAnalyzer {
    public static String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mood Analyzer");


    }

    public static String analyzeMood() {
        if (message.equals("I am in Sad Mood"))
            return ("SAD");
        else
            return ("HAPPY");

    }


}