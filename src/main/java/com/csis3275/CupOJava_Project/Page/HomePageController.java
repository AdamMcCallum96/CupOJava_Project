package com.csis3275.CupOJava_Project.Page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	
	@RequestMapping("home")	
	public ModelAndView showHomePage() {
		
		ModelAndView modelView = new ModelAndView();
		
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
