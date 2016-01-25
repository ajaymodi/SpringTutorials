package edu.asu.diging.tutorial.spring.service;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements IMoodService{
 
    private List<String> moodList = new ArrayList<String>();
    private HashMap<String, String> explanationList = new HashMap<String, String> (); 
    @PostConstruct
    public void init() {
        moodList.add("Accpted");
        moodList.add("Angry");
        moodList.add("Calm");
        moodList.add("Defensive");
        moodList.add("Happy");
        moodList.add("Sad");
        
        explanationList.put("Accpted","Explanation for accepted goes here.");
        explanationList.put("Angry","Explanation for angry goes here.");
        explanationList.put("Calm","Explanation for calm goes here.");
        explanationList.put("Defensive","Explanation for defensive goes here.");
        explanationList.put("Happy","Explanation for happy goes here.");
        explanationList.put("Sad","Explanation for sad goes here.");
        
        
    }
         
    public Mood getCurrentMood() {
        Random r = new Random();
        return new Mood(moodList.get(r.nextInt(moodList.size())));
    }
    
    public String getMoodExplanation(String mood) {
        return explanationList.get(mood);
    }
    
    
}