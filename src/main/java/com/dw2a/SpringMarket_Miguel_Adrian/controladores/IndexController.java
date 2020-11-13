package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String controller1(Model model) {

		return "index";
	}

	@RequestMapping("/producto/crear")
	public String crearProducto(Model model) {
		return "crearProducto";


	}
}
