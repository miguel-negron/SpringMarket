package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.LineaDeCompraService;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@Controller
public class CompraController {
	
	@Autowired
	LineaDeCompraService lineaDeCompraService;

	@Autowired
	ProductoService productoService;
	
	//TODO hay que hacer que esto sea un post
	@GetMapping("/compra/producto/{idProducto}")
	public String comprarIdPost(Model modelo, HttpSession sesion, @PathVariable String idProducto) {
		
		if (sesion.getAttribute("USUARIO") == null) {
			return "/usuario/login";
		}

		System.out.println(idProducto);

		System.out.println(Long.parseLong(idProducto));
		lineaDeCompraService.crearLineaDeCompra((Usuario) sesion.getAttribute("USUARIO"), productoService.obtenerProducto(Long.parseLong(idProducto)), 1);
		
		
		return "redirect:/compra/miscompras";
	}
	
	@GetMapping("/compra/miscompras")
	public String miscomprasGet(Model modelo, HttpSession sesion) {
		
		modelo.addAttribute("lineas", lineaDeCompraService.listarLineaDeComprasWhereUsuario((Usuario) sesion.getAttribute("USUARIO")));
		
		return "/compra/carrito";	
	}
	
	@PostMapping("/compra/devolver/{idCompra}")
	public String devolverPost(Model modelo, @PathVariable String idCompra) {
		return "";
	}
}
