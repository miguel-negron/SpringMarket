package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	ProductoService productoService;

	@GetMapping("producto/{idProducto}")
	public String getProductoWhereId(Model model, @PathVariable(name = "idProducto") String idProducto) {

		Producto p = productoService.obtenerProducto(Long.parseLong(idProducto));
		model.addAttribute("producto", p);

		return "producto/detallesProducto";
	}

	@GetMapping("/listadoProductos")
	public String listadoProductos(Model model) {

		model.addAttribute("productos", productoService.listarProductos());

		return "producto/listadoProductos";
	}

	@GetMapping("/producto/crear")
	public String crearProducto(Model model) {
		return "producto/crearProducto";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/producto/crear")
	public String crearProductoEnvio(Model model, @RequestParam String nombre, @RequestParam String Descripcion,
			@RequestParam Double precio, @RequestParam Integer porcentaje) {

		Producto p = new Producto(nombre, Descripcion, precio, porcentaje);
		System.out.println("(ProductoController.java) OBJETO CREADO");
		productoService.crearProducto(p);

		return "redirect:/producto/" + p.getId();
	}

	@GetMapping("producto/buscar")
	public String busquedaProductos(Model model, @RequestParam String nombreProducto) {

		return "producto/resultadosBusquedaProductos";
	}

	@GetMapping("/producto/borrar/{idProducto}")
	public String borrarProducto(Model model, @PathVariable String idProducto) {
		productoService.eliminarProducto(Long.parseLong(idProducto));

		return "redirect:/";
	}

}
