package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.service.UserServiceImplementation;

@Controller  
public class UserController {
	@Autowired
	private UserServiceImplementation userServiceImplementation;
	@RequestMapping("/checkLogin")  
    public ModelAndView checkLogin(HttpServletRequest request,HttpServletResponse res) {   
		 String emailId=request.getParameter("email");  
	        String password=request.getParameter("password");
	        Boolean temp=userServiceImplementation.checkLogin(emailId, password);
	        if(temp)
	        {
	        return new ModelAndView("successful"); 
	        }
	        else
	        {
	        	return new ModelAndView("unsuccessful");
	        }
	    } 
	 @RequestMapping("/checkIfUserExists")
	 public ModelAndView checkIfUserExists (HttpServletRequest request,HttpServletResponse res) {   
		
	        return new ModelAndView("register");  
	    } 
	 
	 @RequestMapping("/bookingDetails")
	 public ModelAndView bookingDetails (HttpServletRequest request,HttpServletResponse res) {   
		
	        return new ModelAndView("bookingdetails");  
	    } 
	 @RequestMapping("/cancelBooking")
	 public ModelAndView cancelBooking() {   
			
	        return new ModelAndView("welcomepage");  
	    }
	 
	 @RequestMapping("/getHistory")
	 public ModelAndView getHistory() {   
			
	        return new ModelAndView("welcomepage");  
	    }
	 
	 @RequestMapping("/homepage")  
	    public ModelAndView homepage() {   
	        return new ModelAndView("homepage");  
	    } 
}
