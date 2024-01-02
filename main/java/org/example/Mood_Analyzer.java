package org.example;

public class Mood_Analyzer {

    private String message;

    // Default constructor
    public Mood_Analyzer() {
        this.message = "";
    }

    // Constructor with a parameter
    public Mood_Analyzer(String message) {
        this.message = (message != null) ? message : "";
    }

    // Method to set the message
    public void setMessage(String message) {
        this.message = (message != null) ? message : "";
    }

    // Method to analyze mood
    public String analyseMood() {
        if (message != null && message.contains("happy")) {
            return "Happy Mood";
        } else if (message != null && message.contains("sad")) {
            return "Sad Mood";
        } else {
            return "Unable to determine mood";
        }
    }



    public static void main(String[] args) {
        // Example usage with constructor that takes a message
        Mood_Analyzer moodAnalyzer = new Mood_Analyzer("I am in Sad Mood");
        String result = moodAnalyzer.analyseMood();
        System.out.println(result);
    }
}
