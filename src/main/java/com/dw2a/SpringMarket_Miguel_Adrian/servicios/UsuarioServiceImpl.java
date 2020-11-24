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
	public Usuario crearUsuario(Usuario usuario) {
		return usuarioDao.crear(usuario);
	}

	@Override
	public void eliminarUsuario(long idUsuario) {
		usuarioDao.borrar(idUsuario);
	}

	@Override
	public Usuario obtenerUsuario(long idUsuario) {
		return usuarioDao.buscar(idUsuario);
	}

	@Override
	public Usuario obtenerUsuarioWhereNombre(String nombre) {
		return usuarioDao.selectUsuarioWhereNombre(nombre);
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		return usuarioDao.actualizar(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioDao.listarTodos();
	}

}
