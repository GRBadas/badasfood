package com.badas.badasfoodsql.domain.repository;

import java.util.List;

import com.badas.badasfoodsql.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);
	
}
