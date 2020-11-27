package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@Controller
public class IndexController {
	@Autowired
	ProductoService productoService;

	@GetMapping("/")
	public String controller1(Model model) {
		
		List<Producto> productos = new ArrayList<>();
		List<Producto> productosDB = productoService.listarProductos();
		
		for (int i = 0; i < productosDB.size(); i++) {
			if (productosDB.get(i).getDescuento() != 0) {
				productos.add(productosDB.get(i));
			}
			
			if (productos.size() > 7) {
				break;
			}
		}

		model.addAttribute("productos", productos);
		
		return "index";
	}
	
	@GetMapping("/index")
	public String controller2(Model model) {
		return "redirect/:index";
	}
	
	@GetMapping("/error")
	public String errorGet() {
		return "error";
	}

}
