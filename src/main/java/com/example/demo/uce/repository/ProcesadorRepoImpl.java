package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Procesador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProcesadorRepoImpl implements IProcesadorRepo{
	
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public Procesador buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Procesador.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Procesador procesador=this.buscar(id);
		this.entityManager.remove(procesador);
		
	}

	@Override
	public void insertar(Procesador procesador) {
		// TODO Auto-generated method stub
		this.entityManager.persist(procesador);
	}

	@Override
	public void actualizar(Procesador procesador) {
		// TODO Auto-generated method stub
		this.entityManager.merge(procesador);
	}

}
