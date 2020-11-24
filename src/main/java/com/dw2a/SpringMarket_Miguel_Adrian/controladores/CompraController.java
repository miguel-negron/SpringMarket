package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompraController {

	@PostMapping("/compra/producto/{idProducto}")
	public String comprarIdPost(Model modelo, @PathVariable String idProducto) {
		return "";
	}
	
	@GetMapping("/compra/miscompras")
	public String miscomprasGet(Model modelo) {
		return "";	
	}
	
	@PostMapping("/compra/devolver/{idCompra}")
	public String devolverPost(Model modelo, @PathVariable String idCompra) {
		return "";
	}
}
