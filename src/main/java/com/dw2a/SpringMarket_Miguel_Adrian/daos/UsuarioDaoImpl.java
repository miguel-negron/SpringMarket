package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

@Repository
@Component("UsuarioDao")
public class UsuarioDaoImpl extends DaoGenericoImpl<Usuario> implements UsuarioDao {

	@Override
	public Usuario selectUsuarioWhereNombre(String nombre) {
		Query query = this.em.createQuery("SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre");
		query.setParameter("nombre", nombre);		
		
		Usuario usuario = (Usuario) query.getSingleResult();
		
		return usuario;
	}

}
