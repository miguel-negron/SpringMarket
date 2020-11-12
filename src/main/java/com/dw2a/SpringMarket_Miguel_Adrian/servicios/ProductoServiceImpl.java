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
	public Producto crearProducto(Producto Producto) {
		return productoDao.crear(Producto);
	}

	@Override
	public void eliminarProducto(long idProducto) {
		productoDao.borrar(productoDao);
	}

	@Override
	public Producto obtenerProducto(long idProducto) {
		return productoDao.buscar(productoDao);
	}

	@Override
	public Producto modificarProducto(Producto Producto) {
		return productoDao.actualizar(Producto);
	}

	@Override
	public List<Producto> listarProductoes() {
		return productoDao.listarTodos();
	}

	@Override
	public List<Producto> listarProductoesQueNoImparten(Long idModulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenerProductoWhereNombre(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}