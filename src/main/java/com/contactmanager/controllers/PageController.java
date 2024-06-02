package com.contactmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class PageController {

    @RequestMapping("/Home")
    public String home(Model model) {
        model.addAttribute("Title", "Contact Manager - Home");
        // Sending the Data to the View
        System.out.println("Home Page Requested");
        return "home";
    }
    
}
