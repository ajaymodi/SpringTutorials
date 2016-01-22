package edu.asu.diging.tutorial.spring.domain;

public class Mood {
    
    private String feeling;
 
    public Mood(String mood) {
        feeling = mood;
    }
 
    public String getFeeling() {
        return feeling;
    }
 
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
}