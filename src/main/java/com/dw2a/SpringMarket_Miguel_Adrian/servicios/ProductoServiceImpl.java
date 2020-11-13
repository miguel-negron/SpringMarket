package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw2a.SpringMarket_Miguel_Adrian.daos.ProductoDao;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;

@Transactional
@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	ProductoDao productoDao;

	@Override
	public Producto crearProducto(Producto producto) {
		return productoDao.crear(producto);
	}

	@Override
	public void eliminarProducto(long idProducto) {
		productoDao.borrar(obtenerProducto(idProducto));
	}

	@Override
	public Producto obtenerProducto(long idProducto) {
		return productoDao.buscar(idProducto);
	}

	@Override
	public Producto obtenerProductoWhereNombre(String nombreProducto) {
		return null; //TODO
	}

	@Override
	public Producto modificarProducto(Producto producto) {
		return productoDao.actualizar(producto);
	}

	@Override
	public List<Producto> listarProductos() {
		return productoDao.listarTodos();
	}

}