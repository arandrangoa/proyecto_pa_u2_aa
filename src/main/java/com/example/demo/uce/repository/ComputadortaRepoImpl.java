package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Computadora;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ComputadortaRepoImpl implements IComputadoraRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.entityManager.persist(computadora);
	}

	@Override
	public void actualizar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.entityManager.merge(computadora);
	}

	@Override
	public Computadora buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Computadora.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Computadora comp=this.buscar(id);
		this.entityManager.remove(comp);
	}

}
