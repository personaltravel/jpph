package com.personalweb.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.personalweb.common.vo.SearchVO;

@Controller
public class IndexController {
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView index() {
 
    	ModelAndView modelAndView = new ModelAndView();
    	modelAndView.setViewName("home");
    	modelAndView.addObject("pageTitle", "PersonalWebSite");
    	modelAndView.addObject("pageName", "HomePage");
    	modelAndView.addObject("displayDetails", true);
    	
    	SearchVO searchVO = new SearchVO();
    	searchVO.setCity("London");
    	modelAndView.addObject("searchVO", searchVO);
    	
        return modelAndView;
    }
    
}
