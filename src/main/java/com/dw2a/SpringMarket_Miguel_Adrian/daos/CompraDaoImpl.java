package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Compra;

@Repository
@Component("CompraDao")
public class CompraDaoImpl extends DaoGenericoImpl<Compra> implements CompraDao{

}
