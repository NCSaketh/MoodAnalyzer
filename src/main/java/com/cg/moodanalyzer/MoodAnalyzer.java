package com.cg.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mood Analyzer");
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        System.out.println("Enter the mood");
        String message = sc.nextLine();
        analyzeMood(message);
    }

    private static String analyzeMood(String message) {
        return("Happy or Sad");
    }


}
