package com.cg.moodanalyzer;
import java.util.Scanner;

import java.util.Scanner;

public class MoodAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mood Analyzer");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        System.out.println(moodAnalyzer.analyzeMood("Mood"));

    }

    public static String analyzeMood(String message) {
        if(message.equals("I am in Sad Mood"))
            return("SAD");
        else
            return("HAPPY");

    }


}