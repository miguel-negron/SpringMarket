package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;

@Repository
@Component("ProductoDao")
public class ProductoDaoImpl extends DaoGenericoImpl<Producto> implements ProductoDao {
	
	@Override
	public List<Producto> listarProductos() {
		Query query = this.em.createQuery("FROM Producto");
		@SuppressWarnings("unchecked")
		List<Producto> lProducto = query.getResultList();
		return lProducto;
	}

	@Override
	public List<Producto> selectProductosWhereNombre(String nombre) {
		Query query = this.em.createQuery("SELECT p FROM Producto p WHERE p.nombre LIKE :nombre");
		query.setParameter("nombre", "%" + nombre + "%");		
		
		@SuppressWarnings("unchecked")
		List<Producto> lProducto = query.getResultList();
		
		return lProducto;
	}
}
