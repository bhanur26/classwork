package com.pack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Bhanu")
public class HelloWorldController {
	
	
	private String message;

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView hello()
	{
		ModelAndView m= new ModelAndView("welcome","helloSpringframeWork",message);
		m.addObject("message", "Hello Spring");
		return m;
	}

}
