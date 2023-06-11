package com.pack.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public int wish() {
		return 10;
	}
	@RequestMapping("/stuinfo")
	@ResponseBody
	public String info() {
		return "Students are Studying";
	}

}
