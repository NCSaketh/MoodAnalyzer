package com.cg.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = MoodAnalyzer.analyzeMood("I am in Sad Mood");
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_InAnyMood_ShouldReturnHAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String result = MoodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", result);
    }
}
