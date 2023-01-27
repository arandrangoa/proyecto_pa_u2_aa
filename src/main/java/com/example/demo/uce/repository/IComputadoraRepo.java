package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Computadora;

public interface IComputadoraRepo {
	
	public void insertar(Computadora computadora);
	public void actualizar(Computadora computadora);
	
	public Computadora buscar(Integer id);
	public void eliminar(Integer id);
	

}
