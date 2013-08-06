package com.beingjavaguys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.domain.User;
import com.beingjavaguys.service.UserService;

@Controller
public class HomeController extends BodyTagSupport{

	@Autowired
	private UserService userService;

	private String definition;
	
	
	
	@RequestMapping("/register")
	public ModelAndView getRegisterForm() 
	
	{
		String stringis="com.webonise.difinition";
		
		System.out.println("register....... ");
		
		//........................this is to call the dynamic generated pages....................
		//.......................................................................................		
		
		ModelAndView jspCall = new ModelAndView("SearchTool");
		
		
		System.out.println("jspCall is  : "+jspCall);
		
		
		System.out.println("Defination is : "+definition);
		
		
		
		//........................calling the service layer... ....................
		//.......................................................................................		
				
		userService.display();
		
		
		//........................return the ModelAndView class object ......................
		//.......................................................................................		
				
		System.out.println("Register Form");
		
		return jspCall;
	
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getFields() 
	
	{
		
		System.out.println("fields got . ....... ");
	
		
		return new ModelAndView();
	
	}
	
	

	
//
//	@RequestMapping("/saveUser")
//	public ModelAndView saveUserData(@ModelAttribute("user") User user,
//			BindingResult result) {
//		System.out.println("saveUserData..........");
//		userService.addUser(user);
//		System.out.println("Save User Data");
//		return new ModelAndView("redirect:/userList.html");
//	}

//	@RequestMapping("/userList")
//	public ModelAndView getUserList() {
//		System.out.println("getUserList...............");
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("user", userService.getUser());
//		return new ModelAndView("UserDetails", model);
//
//	}
}
