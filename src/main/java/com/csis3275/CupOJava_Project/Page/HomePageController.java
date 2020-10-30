package com.csis3275.CupOJava_Project.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	
	@RequestMapping("home")	
	public ModelAndView showHomePage(HttpServletRequest request) {
		
		ModelAndView modelView = new ModelAndView();
		HttpSession loginSession = request.getSession();
		//Checks login status
		if(loginSession.getAttribute("username") != null) {
			modelView.addObject("loggedIn", true);	
			
		}
		modelView.setViewName("home.jsp");
		return modelView;
	}
	
	@RequestMapping("registration")
		public ModelAndView showRegistrationPage() {
		
		ModelAndView modelView = new ModelAndView();
		
		modelView.setViewName("registration.jsp");
		return modelView;
		
	}
			

}
