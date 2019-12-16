package com.rosna.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rosna.model.Login;
import com.rosna.model.User;
import com.rosna.service.userService;

@Controller
public class LoginController {

	@Autowired
	public userService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView showRegister() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response,Login login)
	{
		System.out.println("Login process");
		ModelAndView mav=null;
		User user=userService.validateUser(login);
		if(null!=user)
		{
			//when data is available redirect to home page with username
			
			mav=new ModelAndView("welcome");
			mav.addObject("username", user.getUsername());
		}
		else
		{
			//when data is not available redirect to login page with Error
			mav=new ModelAndView("login");
			mav.addObject("message","User name or password is wrong !");
		}
		return mav;
	}
}
