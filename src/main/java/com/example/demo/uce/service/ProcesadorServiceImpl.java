package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IProcesadorRepo;
import com.example.demo.uce.modelo.Procesador;


@Service
public class ProcesadorServiceImpl implements IProcesadorService{
	
	@Autowired
	private IProcesadorRepo iProcesadorRepo;

	@Override
	public void agregar(Procesador procesador) {
		// TODO Auto-generated method stub
		this.iProcesadorRepo.insertar(procesador);
	}

	@Override
	public void modificar(Procesador procesador) {
		// TODO Auto-generated method stub
		this.iProcesadorRepo.actualizar(procesador);
	}

	@Override
	public Procesador encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iProcesadorRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iProcesadorRepo.eliminar(id);
	}

	

}
