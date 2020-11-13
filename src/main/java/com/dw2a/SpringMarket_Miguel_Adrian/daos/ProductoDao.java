package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;

public interface ProductoDao extends DaoGenerico<Producto> {

	List<Producto> listarProductos();

}
