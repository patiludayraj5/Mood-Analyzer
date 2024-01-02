import org.example.Mood_Analyzer;
import org.junit.Assert;
import org.junit.Test;

public class TestMood_Analyzer {
    @Test
    public void testAnalyseMood() {
        // Test case with "I am in Sad Mood"
        Mood_Analyzer moodAnalyzer = new Mood_Analyzer("I am in Sad Mood");
        Assert.assertEquals("Sad Mood", moodAnalyzer.analyseMood());

        // Test case with null message
        Mood_Analyzer moodAnalyzerNull = new Mood_Analyzer(null);
        Assert.assertEquals("Unable to determine mood", moodAnalyzerNull.analyseMood());

        // Additional test case with "I am feeling happy today!"
        Mood_Analyzer moodAnalyzerHappy = new Mood_Analyzer("I am feeling happy today!");
        Assert.assertEquals("Happy Mood", moodAnalyzerHappy.analyseMood());
    }
}