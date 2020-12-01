package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

public interface CompraDao extends DaoGenerico<Compra>{
	
	public List<Compra> listarComprasWhereUsuario(Usuario usuario);
	
	public Compra getCompraSinTramitar(Usuario usuario);

}
