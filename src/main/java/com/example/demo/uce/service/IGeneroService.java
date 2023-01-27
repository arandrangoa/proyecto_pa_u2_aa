package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Genero;

public interface IGeneroService {
	
	public void agregar(Genero genero);
	public void modificar(Genero genero);
	
	public Genero buscar(Integer id);
	public void elminar(Integer id);

}
