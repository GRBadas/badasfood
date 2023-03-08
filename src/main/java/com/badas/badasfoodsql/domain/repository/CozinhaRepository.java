package com.badas.badasfoodsql.domain.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badas.badasfoodsql.domain.model.Cozinha;

public interface CozinhaRepository  extends JpaRepository<Cozinha, Long>{

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}