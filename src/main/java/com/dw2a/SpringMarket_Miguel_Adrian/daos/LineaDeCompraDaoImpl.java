package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.LineaDeCompra;

@Repository
@Component("LineaDeCompraDao")
public class LineaDeCompraDaoImpl extends DaoGenericoImpl<LineaDeCompra> implements LineaDeCompraDao {

	public List<LineaDeCompra> listarLineasDeCompraWhereCompra(Compra compra) {

		Query query = this.em.createQuery("SELECT l FROM LINEA_DE_COMPRA l WHERE l.compra LIKE :compra");
		query.setParameter("compra", compra);

		@SuppressWarnings("unchecked")
		List<LineaDeCompra> listaCompras = query.getResultList();

		return listaCompras;
	}
}
