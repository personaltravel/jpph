package com.personalweb.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView index() {
 
    	ModelAndView modelAndView = new ModelAndView();
    	
    	modelAndView.setViewName("home");
 
    	modelAndView.addObject("pageTitle", "Personalweb - TravelSite");
    	modelAndView.addObject("pageName", "HomePage");
    	modelAndView.addObject("displayDeals", true);
    	
        return modelAndView;
    }
    
}
