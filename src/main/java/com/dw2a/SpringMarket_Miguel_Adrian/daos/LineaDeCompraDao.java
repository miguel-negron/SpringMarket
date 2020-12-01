package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;
import com.dw2a.SpringMarket_Miguel_Adrian.entidades.LineaDeCompra;

public interface LineaDeCompraDao extends DaoGenerico<LineaDeCompra>{

	public List<LineaDeCompra> listarLineasDeCompraWhereCompra(Compra compra);
}
