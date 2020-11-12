package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import java.util.List;
import java.util.Map;

public interface DaoGenerico<T> {

	long contarTodos(Map<String, Object> params);

	T crear(T t);

	void borrar(Object id);

	T buscar(Object id);

	T actualizar(T t);
	
	List<T> listarTodos();
}
