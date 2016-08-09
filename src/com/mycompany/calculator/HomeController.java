package com.mycompany.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController
{
	@RequestMapping("/home")
	protected ModelAndView calculatorHome()
	{

		ModelAndView model = new ModelAndView("HomePage");
		model.addObject("msg", "Calculator Home");

		return model;
	}
}
