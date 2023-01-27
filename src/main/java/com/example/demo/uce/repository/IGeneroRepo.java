package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Genero;

public interface IGeneroRepo {
	
	public void insertar(Genero genero);
	public void actualizar(Genero genero);
	
	public Genero buscar(Integer id);
	public void elminar(Integer id);

}
