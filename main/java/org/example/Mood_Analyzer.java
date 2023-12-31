package org.example;

public class Mood_Analyzer {
    private String message;
    public Mood_Analyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}