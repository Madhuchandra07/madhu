package jbr.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;










import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistrationController  {
	private static final long serialVersionUID = 1L;
	@Autowired
	  public UserService userService;
  
  
  
  public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response){
	
	  ModelAndView model =new ModelAndView(); 
	  model.addObject("user", new User());
	  return model;
	  
  }
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("user") User user) {
  userService.register(user);
  return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
  
  

}
	