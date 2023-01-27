package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Pelicula;

public interface IPeliculaRepo {
	
	public void insetar(Pelicula pelicula);
	public void actualizar(Pelicula pelicula);
	
	public Pelicula buscar(Integer id);
	public void eliminar(Integer id);
	

}
