package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String controller1(Model model) {

		return "index";
	}

}
