package com.dw2a.SpringMarket_Miguel_Adrian.entidades;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class DatosDePago {

	@Column(nullable=false)
	private Integer numeroTarjeta;
	@Column(nullable=false)
	private Integer codigoSeguridad;
	@Column(nullable=false)
	private String direccion;
}
