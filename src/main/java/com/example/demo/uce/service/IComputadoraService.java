package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Computadora;

public interface IComputadoraService {
	
	public void agregar(Computadora computadora);
	public void modificar(Computadora computadora);
	
	public Computadora encontrar(Integer id);
	public void borrar(Integer id);

}
