package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Pelicula;

public interface IPeliculaService {
	
	public void agregar(Pelicula pelicula);
	public void modificar(Pelicula pelicula);
	
	public Pelicula buscar(Integer id);
	public void eliminar(Integer id);
	

}
