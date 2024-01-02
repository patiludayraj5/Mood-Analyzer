import org.example.Mood_Analyzer;
import org.junit.Assert;
import org.junit.Test;

public class TestMood_Analyzer {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        Mood_Analyzer moodAnalyzer = new Mood_Analyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        Mood_Analyzer moodAnalyzer = new Mood_Analyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}