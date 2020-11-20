package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

public interface UsuarioService {
	
	public Usuario crearUsuario(Usuario Usuario);

	public void eliminarUsuario(long idUsuario);

	public Usuario obtenerUsuario(long idUsuario);

	public List<Usuario> obtenerUsuarioWhereNombre(String nombreUsuario);

	public Usuario modificarUsuario(Usuario Usuario);

	public List<Usuario> listarUsuarios();
}
