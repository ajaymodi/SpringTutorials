package edu.asu.diging.tutorial.spring.service;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService {
 
    private List<String> moodList = new ArrayList<String>();
    
    @PostConstruct
    public void init() {
        moodList.add("Accpted");
        moodList.add("Angry");
        moodList.add("Calm");
        moodList.add("Defensive");
        moodList.add("Happy");
        moodList.add("Sad");
    }
         
    public Mood getCurrentMood() {
        Random r = new Random();
        return new Mood(moodList.get(r.nextInt(moodList.size())));
    }
    
    
}