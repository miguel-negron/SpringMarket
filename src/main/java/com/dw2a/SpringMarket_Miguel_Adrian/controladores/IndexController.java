package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@Controller
public class IndexController {
	@Autowired
	ProductoService productoService;

	@GetMapping("/")
	public String controller1(Model model) {

		model.addAttribute("productos", productoService.listarProductos());
		return "index";
	}
	
	@GetMapping("/index")
	public String controller2(Model model) {
		return "redirect/:index";
	}

}
