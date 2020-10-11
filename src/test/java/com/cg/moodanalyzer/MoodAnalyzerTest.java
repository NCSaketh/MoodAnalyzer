package com.cg.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSAD() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String result = MoodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_InAnyMood_ShouldReturnHAPPY() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String result = MoodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        try {
            MoodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

}
