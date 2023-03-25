package com.badas.badasfoodsql.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.badas.badasfoodsql.domain.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);

}
