package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw2a.SpringMarket_Miguel_Adrian.daos.CompraDao;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

@Transactional
@Service
public class CompraServiceImpl implements CompraService{
	
	@Autowired
	CompraDao compraDao;

	
	/*
	 * Generales
	 */
	
	
	@Override
	public Compra crearCompra(Compra compra) {
		return compraDao.crear(compra);
	}

	@Override
	public void eliminarCompra(long idCompra) {
		compraDao.borrar(idCompra);
	}

	@Override
	public Compra obtenerCompra(long idCompra) {
		return compraDao.buscar(idCompra);
	}

	@Override
	public Compra modificarCompra(Compra compra) {
		return compraDao.actualizar(compra);
	}

	@Override
	public List<Compra> listarCompras() {
		return compraDao.listarTodos();
	}
	
	/*
	 * Propios
	 */

	@Override
	public List<Compra> obtenerCompraWhereUsuario(Usuario usuario) {
		return compraDao.listarComprasWhereUsuario(usuario);
	}

	@Override
	public Compra tramitarCompra(Compra compra) {
		compra.setTramitada(true);
		
		return compraDao.actualizar(compra);
	}

}
