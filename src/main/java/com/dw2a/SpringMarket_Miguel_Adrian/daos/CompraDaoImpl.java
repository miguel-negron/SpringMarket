package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

@Repository
@Component("CompraDao")
public class CompraDaoImpl extends DaoGenericoImpl<Compra> implements CompraDao{

	public List<Compra> listarComprasWhereUsuario(Usuario usuario) {
		
		Query query = this.em.createQuery("SELECT c FROM Compra c WHERE c.usuario LIKE :usuario");
		query.setParameter("usuario", usuario);		
		
		@SuppressWarnings("unchecked")
		List<Compra> listaCompras = query.getResultList();
		
		return listaCompras;
	}

	@Override
	public Compra getCompraSinTramitar(Usuario usuario) {
		Query query = this.em.createQuery("SELECT c FROM COMPRA c WHERE c.usuario LIKE :usuario AND c.isTramitada = false");
		query.setParameter("usuario", usuario);		
		
		Compra compraSinTramitar;
		
		try {
			compraSinTramitar = (Compra) query.getSingleResult();
		} catch (Exception e) {
			compraSinTramitar = new Compra(usuario);
		}		
		
		crear(compraSinTramitar);
		
		return compraSinTramitar;
	}
}
