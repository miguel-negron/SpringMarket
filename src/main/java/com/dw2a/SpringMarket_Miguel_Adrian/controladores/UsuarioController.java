package com.dw2a.SpringMarket_Miguel_Adrian.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dw2a.SpringMarket_Miguel_Adrian.servicios.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

}