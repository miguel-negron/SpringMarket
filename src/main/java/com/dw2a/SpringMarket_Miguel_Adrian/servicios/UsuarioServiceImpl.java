package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw2a.SpringMarket_Miguel_Adrian.daos.UsuarioDao;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioDao usuarioDao;

	@Override
	public Usuario crearUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuario(long idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario obtenerUsuario(long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> obtenerUsuarioWhereNombre(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario modificarUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
