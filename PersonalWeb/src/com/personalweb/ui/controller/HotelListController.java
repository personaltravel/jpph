package com.personalweb.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.personalweb.hotel.vo.HotelSearchInfo;

@Controller
public class HotelListController {
	
    @RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView index() {

    	//Get the list of hotels and display it on the page.
    	
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("home");
    	modelAndView.addObject("pageTitle", "PersonalWebSite");
    	modelAndView.addObject("pageName", "HomePage");
    	modelAndView.addObject("displayDetails", true);
    	
    	
        return modelAndView;
    }
    
}
