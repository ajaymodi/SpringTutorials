package edu.asu.diging.tutorial.spring.service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;

public interface IMoodService {
 
    public abstract Mood getCurrentMood();
    
    public abstract String getMoodExplanation(String mood);
    
    
}