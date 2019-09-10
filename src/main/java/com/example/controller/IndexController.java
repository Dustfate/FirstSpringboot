package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/dxgl")
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/index.html";
	}

}
