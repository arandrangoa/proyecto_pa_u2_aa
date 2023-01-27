package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Genero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class GeneroRepoImpl implements IGeneroRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Genero genero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(genero);
	}

	@Override
	public void actualizar(Genero genero) {
		// TODO Auto-generated method stub
		this.entityManager.merge(genero);
	}

	@Override
	public Genero buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Genero.class, id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		Genero gen=this.buscar(id);
		this.entityManager.remove(gen);
	}

}
