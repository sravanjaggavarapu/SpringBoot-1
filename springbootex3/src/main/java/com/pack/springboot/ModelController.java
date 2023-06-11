package com.pack.springboot;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	@RequestMapping("/info")
	public String info(Model model) {
		model.addAttribute("message","Welcome to Hyderabad");
		model.addAttribute("username","sravan");
		model.addAttribute("age","21");
		return "info";
	}
	@RequestMapping("/perlist")
	public String personList(Model model) {
		List<Person> persons = List.of(
				new Person("bill", "gates", "bill123@gmail.com"),
				new Person("steve", "jobs", "steve1243@gmail.com"),
                new Person("sravan", "kumar", "sravan2001@gmail.com"));
		model.addAttribute("persons",persons);
		return "person-list";
	}
	@RequestMapping("/sr")
	  public ModelAndView info() {
		  ModelAndView modelAndView = new ModelAndView();
		  modelAndView.addObject("name","sravan");
		  modelAndView.setViewName("data");
		  return modelAndView;
		  
	  }
	 
}
