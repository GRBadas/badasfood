package com.badas.badasfoodsql.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.badas.badasfoodsql.domain.model.Estado;
import com.badas.badasfoodsql.domain.repository.EstadoRepository;

public class EstadoRepositoryImpl implements EstadoRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Estado> listar() {
		return manager.createQuery("from Estado", Estado.class)
				.getResultList();
	}

	@Override
	public Estado buscar(Long id) {
		return manager.find(Estado.class, id);
	}

	@Transactional
	@Override
	public Estado salvar(Estado estado) {
		return manager.merge(estado);
	}

	@Transactional
	@Override
	public void remover(Estado estado) {
		estado = buscar(estado.getId());
		manager.remove(estado);
	}
}
