package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Procesador;

public interface IProcesadorRepo {
	
	public void insertar(Procesador procesador);
	public void actualizar(Procesador procesador);
	
	public Procesador buscar(Integer id);
	public void eliminar(Integer id);

}
