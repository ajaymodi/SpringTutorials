package edu.asu.diging.tutorial.spring.web;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodService;

@Controller
public class HomeController {
 
    @Autowired
    private MoodService service;
 
    @RequestMapping(value = "/")
    public String home(ModelMap map) {
        map.addAttribute("mood", service.getCurrentMood());
        return "home";
    }
}