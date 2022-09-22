package vn.techmaster.jobhunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.techmaster.jobhunt.model.City;

@Controller
public class searchJob {
    @GetMapping("/searchcity")
    public String searchCity(Model model){
        model.addAttribute("travelTypes", City.values());
        return "search_city";
    }
}
