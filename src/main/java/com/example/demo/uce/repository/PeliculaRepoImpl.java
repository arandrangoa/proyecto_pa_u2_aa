package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PeliculaRepoImpl implements IPeliculaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insetar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pelicula);
	}

	@Override
	public Pelicula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pelicula.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pelicula pel=this.buscar(id);
		this.entityManager.remove(pel);
	}

}
