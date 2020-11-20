package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;

public interface ProductoService {

	public Producto crearProducto(Producto Producto);

	public void eliminarProducto(long idProducto);

	public Producto obtenerProducto(long idProducto);
	
	public List<Producto> obtenerProductoWhereNombre(String nombreProducto);

	public Producto modificarProducto(Producto Producto);

	public List<Producto> listarProductos();

}
