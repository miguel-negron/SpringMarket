package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@GetMapping("producto/{idProducto}")
	public String getProductoWhereId(Model model, @PathVariable(name = "idProducto") String idProducto) {

		productoService.obtenerProducto(Long.parseLong(idProducto));
		return "producto/detallesProducto";
	}

	@GetMapping("/producto/crear")
	public String crearProducto(Model model) {
		return "producto/crearProducto";
	}

	@PostMapping("/producto/crear")
	public String crearProductoEnvio(Model model) {
		return "producto/crearProducto";
	}

	@GetMapping("producto/buscar")
	public String busquedaProductos(Model model) {
		return "producto/resultadosBusquedaProductos";
	}

	@GetMapping("/producto/borrar/{idProducto}")
	public String borrarProducto(Model model, @PathVariable String idProducto) {
		productoService.eliminarProducto(Long.parseLong(idProducto));
		return "redirect:/index";
	}

}
