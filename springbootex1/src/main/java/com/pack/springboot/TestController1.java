package com.pack.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vi")
public class TestController1 {
	@RequestMapping("/test")
	@ResponseBody
	public String wish() {
		return "Good Morning";
	}
	@RequestMapping("/stuinfo")
	@ResponseBody
	public String info() {
		return "Students are Studying";
	}

}

