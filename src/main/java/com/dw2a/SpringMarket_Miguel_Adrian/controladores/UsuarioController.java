package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;
import com.dw2a.SpringMarket_Miguel_Adrian.servicios.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuario/signup")
	public String signUpGet(Model model) {
		return "/usuario/signup";
	}

	@PostMapping("/usuario/signup")
	public String signUpPost(Model model, @RequestParam String nombre, @RequestParam String apellidos,
			@RequestParam String password, @RequestParam String email, String fechaNac) {

		if (usuarioService.obtenerUsuarioWhereNombre(nombre) != null) {
			return "/usuario/signup";
		} else {
			Usuario usuario = new Usuario(nombre, apellidos, password, email, fechaNac);
			usuarioService.crearUsuario(usuario);

			return "redirect:/usuario/perfil/" + usuario.getId();
		}
	}

	@GetMapping("/usuario/login")
	public String loginGet(Model model) {
		return "/usuario/login";
	}

	@PostMapping("/usuario/login")
	public String loginPost(Model model, @RequestParam String nombre, @RequestParam String password) {

		Usuario usuario = usuarioService.obtenerUsuarioWhereNombre(nombre);
		System.out.println(usuario.getPassword() + "  -  " + password);
		if (usuario.getPassword().equals(password)) {
			System.out.println("Estamos dentro");
		}

		return "/usuario/login";
	}

	@GetMapping("/usuario/perfil/{idUsuario}")
	public String perfilGet(Model model, @PathVariable String idUsuario) {

		Usuario usuario = usuarioService.obtenerUsuario(Long.parseLong(idUsuario));
		model.addAttribute("usuario", usuario);

		return "/usuario/perfilUsuario";
	}

	@PostMapping("/usuario/perfil/{idUsuario}")
	public String perfilPost(Model model, @PathVariable String idUsuario) {

		Usuario usuario = usuarioService.obtenerUsuario(Long.parseLong(idUsuario));
		model.addAttribute("usuario", usuario);

		return "/usuario/perfilUsuario";
	}

	@GetMapping("/usuario/logOut")
	public String logOutGet(Model model) {
		return "";
	}

}
