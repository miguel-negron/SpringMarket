package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.servicios.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuario/signup")
	public String signUpGet(Model model) {
		return "login";
	}

	@PostMapping("/usuario/signup")
	public String signUpPost(Model model) {
		return "login";
	}

	@GetMapping("/usuario/login")
	public String loginGet(Model model) {
		return "login";
	}

	@PostMapping("/usuario/login")
	public String loginPost(Model model) {
		return "";
	}

	@GetMapping("/usuario/perfil/{idUsuario}")
	public String perfilGet(Model model) {
		return "";
	}

	@PostMapping("/usuario/perfil/{idUsuario}")
	public String perfilPost(Model model) {
		return "";
	}

	@GetMapping("/usuario/logOut")
	public String logOutGet(Model model) {
		return "";
	}

}
