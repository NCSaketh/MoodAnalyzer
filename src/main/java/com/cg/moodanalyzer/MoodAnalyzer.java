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
        System.out.println("Enter the mood");
        String message = sc.nextLine();
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(message);
    }

    public static String analyzeMood() {
        try {
            if (message.equals("I am in Sad Mood"))
                return ("SAD");
            else
                return ("HAPPY");
        }
        catch(NullPointerException e)
        {
           return ("Invalid mood entered!");
        }
    }


}