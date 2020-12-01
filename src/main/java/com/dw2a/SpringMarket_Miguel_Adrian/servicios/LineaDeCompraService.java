package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.LineaDeCompra;

public interface LineaDeCompraService {

	// Basicos
	public LineaDeCompra crearLineaDeCompra(LineaDeCompra lineaDeCompra);

	public void eliminarLineaDeCompra(long idLineaDeCompra);

	public LineaDeCompra obtenerLineaDeCompra(long idLineaDeCompra);

	public LineaDeCompra modificarLineaDeCompra(LineaDeCompra lineaDeCompra);

	public List<LineaDeCompra> listarLineaDeCompras();
	
	

}
