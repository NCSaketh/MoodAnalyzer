package com.cg.moodanalyzer;

import java.util.Scanner;

import java.util.Scanner;

public class MoodAnalyzer {
    public static String message;

    public MoodAnalyzer() {
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

    public static String analyzeMood() throws MoodAnalysisException {
        try {
            if (message.length()==0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter valid message");
            }
            else if (message.contains("Sad"))
                return ("SAD");
            else if (message.contains("Happy"))
                return ("HAPPY");
        }
        catch(NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid message");
        }

        return ("Invalid Mood Entered");
    }


}