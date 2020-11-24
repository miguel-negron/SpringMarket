package com.dw2a.SpringMarket_Miguel_Adrian.daos;

import com.dw2a.SpringMarket_Miguel_Adrian.entidades.Usuario;

public interface UsuarioDao extends DaoGenerico<Usuario> {

	Usuario selectUsuarioWhereNombre(String nombre);

}
