package com.cg.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String result = MoodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_InAnyMood_ShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Any Mood");
        String result = MoodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", result);
    }
}
