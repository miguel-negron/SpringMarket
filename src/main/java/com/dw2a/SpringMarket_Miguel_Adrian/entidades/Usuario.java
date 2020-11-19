package com.dw2a.SpringMarket_Miguel_Adrian.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1125823379597889500L;

	@Id
	@GeneratedValue
	
	//DATOS PERSONALES DEL USUARIO
	
	private Long id;
	private String nombre;
	private String apellidos;
	private String password;
	private String email;
	private String fechaNac;
	
	
	//DATOS DE PAGO
	
	private Integer numeroTarjeta;
	private Integer codigoSeguridad;
	private String direccion;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre,String apellidos, String password, String email, String fechaNac,
			Integer numeroTarjeta, Integer codigoSeguridad, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.email = email;
		this.fechaNac = fechaNac;
		this.numeroTarjeta = numeroTarjeta;
		this.codigoSeguridad  = codigoSeguridad;
		this.direccion = direccion;
	}
	

}
