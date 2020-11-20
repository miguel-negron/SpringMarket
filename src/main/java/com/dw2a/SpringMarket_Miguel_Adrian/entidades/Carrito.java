package com.dw2a.SpringMarket_Miguel_Adrian.entidades;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos = new ArrayList<>();
	private ArrayList<Integer> cantidades = new ArrayList<>();
	
	public Carrito() {
		super();
	}
	
	//Propios
	
	public void addProducto(Producto producto, int cantidad) {
		if (cantidad != 0 && producto != null) {
			productos.add(producto);
			cantidades.add(cantidad);
		}
		
		if (cantidades.size() != productos.size()) {
			System.out.println("carrito.java errrroroorroororor");
		}
	}

	//Generated
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Integer> getCantidades() {
		return cantidades;
	}

	public void setCantidades(ArrayList<Integer> cantidades) {
		this.cantidades = cantidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidades == null) ? 0 : cantidades.hashCode());
		result = prime * result + ((productos == null) ? 0 : productos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrito other = (Carrito) obj;
		if (cantidades == null) {
			if (other.cantidades != null)
				return false;
		} else if (!cantidades.equals(other.cantidades))
			return false;
		if (productos == null) {
			if (other.productos != null)
				return false;
		} else if (!productos.equals(other.productos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carrito [productos=" + productos + ", cantidades=" + cantidades + "]";
	}
	

}
