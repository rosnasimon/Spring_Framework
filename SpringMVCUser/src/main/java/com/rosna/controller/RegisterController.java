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
public class RegisterController {

	@Autowired
	public userService userService;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mv=new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="/registerProcess", method = RequestMethod.GET)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,User user) {
		userService.register(user);
		return new ModelAndView("home");
	}
	
	
}
