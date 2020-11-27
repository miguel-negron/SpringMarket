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

@Entity(name = "COMPRA")
public class Compra implements Serializable{

	//Serializable id
	private static final long serialVersionUID = -2156112697492318577L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", foreignKey = @ForeignKey(name = "ID_USUARIO_COMPRA_FK"))
	private Usuario usuario;
	
	@Column(name = "IS_TRAMITADA")
	private boolean isTramitada;

	public Compra() {
		super();
	}

	public Compra(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.isTramitada = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isTramitada() {
		return isTramitada;
	}

	public void setTramitada(boolean isTramitada) {
		this.isTramitada = isTramitada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isTramitada ? 1231 : 1237);
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Compra other = (Compra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isTramitada != other.isTramitada)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", usuario=" + usuario + ", isTramitada=" + isTramitada + "]";
	}
	
	
}
