package edu.asu.diging.tutorial.spring.service;
 
import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService {
 
    public Mood getCurrentMood() {
        return new Mood("happy");
    }
}