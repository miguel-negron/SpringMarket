package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompraController {

	//TODO hay que hacer que esto sea un post
	@GetMapping("/compra/producto/{idProducto}")
	public String comprarIdPost(Model modelo, HttpSession sesion, @PathVariable String idProducto) {
		
		if (sesion.getAttribute("USUARIO") == null) {
			return "/usuario/login";
		}
		
		return "";
	}
	
	@GetMapping("/compra/miscompras")
	public String miscomprasGet(Model modelo) {
		return "/compra/carrito";	
	}
	
	@PostMapping("/compra/devolver/{idCompra}")
	public String devolverPost(Model modelo, @PathVariable String idCompra) {
		return "";
	}
}
