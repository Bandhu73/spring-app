package com.bandhu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/welcome")
	public String show(Model model){
		model.addAttribute("msg", "hi welcome Spring MVC");
		return "Home";
		
	}
}
