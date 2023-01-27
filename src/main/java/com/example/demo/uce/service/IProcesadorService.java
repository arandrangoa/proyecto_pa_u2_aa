package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Procesador;

public interface IProcesadorService {
	
	public void agregar(Procesador procesador);
	public void modificar(Procesador procesador);
	
	public Procesador encontrar(Integer id);
	public void borrar(Integer id);
	
	

}
