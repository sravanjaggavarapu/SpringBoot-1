package com.pack.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/wish")
	public String wish() {
		return "myview";
	}

}
