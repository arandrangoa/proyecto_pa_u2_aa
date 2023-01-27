package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Pelicula;
import com.example.demo.uce.repository.IPeliculaRepo;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	@Autowired
	private IPeliculaRepo iPeliculaRepo;

	@Override
	public void agregar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.iPeliculaRepo.insetar(pelicula);
	}

	@Override
	public void modificar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.iPeliculaRepo.actualizar(pelicula);
	}

	@Override
	public Pelicula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPeliculaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPeliculaRepo.eliminar(id);
	}

}
