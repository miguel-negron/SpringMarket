package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw2a.SpringMarket_Miguel_Adrian.daos.CompraDao;
import com.dw2a.SpringMarket_Miguel_Adrian.daos.LineaDeCompraDao;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.LineaDeCompra;

@Transactional
@Service
public class LineaDeCompraServiceImpl implements LineaDeCompraService{

	@Autowired
	LineaDeCompraDao lineaDeCompraDao;
	
	@Autowired
	CompraDao compraDao;
	
	@Override
	public LineaDeCompra crearLineaDeCompra(LineaDeCompra lineaDeCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarLineaDeCompra(long idLineaDeCompra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LineaDeCompra obtenerLineaDeCompra(long idLineaDeCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LineaDeCompra modificarLineaDeCompra(LineaDeCompra lineaDeCompra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LineaDeCompra> listarLineaDeCompras() {
		// TODO Auto-generated method stub
		return null;
	}

}
