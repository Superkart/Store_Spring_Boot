package com.superkart.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    
    public String home() 
    {
        String viewName = GetViewName();
        return viewName ;
    }

    private String GetViewName()
    {
        return "home";
    }
}


