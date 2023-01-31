package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insetar(Vehiculo vechiculo);
	
	public void actualizar(Vehiculo vehiculo);
	
	public Vehiculo buscar(Integer id);
	
	public void eliminar(Integer id);
	
	

}
