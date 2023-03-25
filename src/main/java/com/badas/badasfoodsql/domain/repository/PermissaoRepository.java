package com.badas.badasfoodsql.domain.repository;

import java.util.List;

import com.badas.badasfoodsql.domain.model.Permissao;

public interface PermissaoRepository {
	
	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);

}
