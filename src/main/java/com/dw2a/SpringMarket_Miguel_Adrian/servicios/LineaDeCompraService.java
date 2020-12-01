package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.LineaDeCompra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Producto;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

public interface LineaDeCompraService {

	// Basicos
	public LineaDeCompra crearLineaDeCompraBasico(LineaDeCompra lineaDeCompra);
	
	public LineaDeCompra crearLineaDeCompra(Usuario usuario, Producto producto, Integer cantidad);

	public void eliminarLineaDeCompra(long idLineaDeCompra);

	public LineaDeCompra obtenerLineaDeCompra(long idLineaDeCompra);

	public LineaDeCompra modificarLineaDeCompra(LineaDeCompra lineaDeCompra);

	public List<LineaDeCompra> listarLineaDeCompras();

	public List<LineaDeCompra> listarLineaDeComprasWhereUsuario(Usuario usuario);
	
	

}
