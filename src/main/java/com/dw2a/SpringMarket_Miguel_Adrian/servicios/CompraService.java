package com.dw2a.SpringMarket_Miguel_Adrian.servicios;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

public interface CompraService {
	
	//Basicos
	public Compra crearCompra(Compra Compra);

	public void eliminarCompra(long idCompra);

	public Compra obtenerCompra(long idCompra);
	
	public Compra modificarCompra(Compra Compra);

	public List<Compra> listarCompras();
	
	//Propios

	public List<Compra> obtenerCompraWhereUsuario(Usuario usuario);
	
	public Compra tramitarCompra(Compra compra);
	
	// public Compra devolverCompra(Compra compra);

}
