package com.dw2a.SpringMarket_Miguel_Adrian.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "LINEA_DE_COMPRA")
public class LineaDeCompra implements Serializable {

	//Serializable ID
	private static final long serialVersionUID = -2794540026022427497L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_PRODUCTO", foreignKey = @ForeignKey(name = "ID_PRODUCTO_LDC_FK"))
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "ID_COMPRA", foreignKey = @ForeignKey(name = "ID_COMPRA_LDC_FK"))
	private Compra compra;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;

	public LineaDeCompra() {
		super();
	}

	public LineaDeCompra(Producto producto, Compra compra, Integer cantidad) {
		super();
		this.producto = producto;
		this.compra = compra;
		this.cantidad = cantidad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((compra == null) ? 0 : compra.hashCode());
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
		LineaDeCompra other = (LineaDeCompra) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (compra == null) {
			if (other.compra != null)
				return false;
		} else if (!compra.equals(other.compra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineaDeCompra [id=" + id + ", producto=" + producto + ", compra=" + compra + ", cantidad=" + cantidad
				+ "]";
	}
	
	
}


