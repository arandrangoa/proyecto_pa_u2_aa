package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Computadora;
import com.example.demo.uce.repository.IComputadoraRepo;

@Service
public class ComputadoraServiceImpl implements IComputadoraService{
	
	@Autowired
	private IComputadoraRepo computadoraRepo;

	@Override
	public void agregar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.insertar(computadora);
	}

	@Override
	public void modificar(Computadora computadora) {
		// TODO Auto-generated method stub
		this.computadoraRepo.actualizar(computadora);
	}

	@Override
	public Computadora encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.computadoraRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.computadoraRepo.eliminar(id);
	}

	

}
