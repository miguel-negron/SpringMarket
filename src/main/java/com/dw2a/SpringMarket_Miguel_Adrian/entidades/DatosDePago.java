package com.dw2a.SpringMarket_Miguel_Adrian.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class DatosDePago {

	@Column(name = "NUMERO_TARJETA")
	private Integer numeroTarjeta;
	@Column(name = "CODIGO_SEGURIDAD")
	private Integer codigoSeguridad;
	@Column(name = "DIRECCION")
	private String direccion;
	
	public DatosDePago(Integer numeroTarjeta, Integer codigoSeguridad, String direccion) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.codigoSeguridad = codigoSeguridad;
		this.direccion = direccion;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoSeguridad == null) ? 0 : codigoSeguridad.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((numeroTarjeta == null) ? 0 : numeroTarjeta.hashCode());
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
		DatosDePago other = (DatosDePago) obj;
		if (codigoSeguridad == null) {
			if (other.codigoSeguridad != null)
				return false;
		} else if (!codigoSeguridad.equals(other.codigoSeguridad))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DatosDePago [numeroTarjeta=" + numeroTarjeta + ", codigoSeguridad=" + codigoSeguridad + ", direccion="
				+ direccion + "]";
	}
	
}
