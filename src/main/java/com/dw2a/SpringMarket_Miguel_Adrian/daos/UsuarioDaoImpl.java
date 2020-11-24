package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

@Repository
@Component("UsuarioDao")
public class UsuarioDaoImpl extends DaoGenericoImpl<Usuario> implements UsuarioDao {

	@PersistenceContext
	protected EntityManager em;

}
