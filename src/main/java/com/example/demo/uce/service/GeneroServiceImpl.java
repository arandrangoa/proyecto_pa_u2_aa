package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Genero;
import com.example.demo.uce.repository.IGeneroRepo;

@Service
public class GeneroServiceImpl implements IGeneroService{
	
	@Autowired
	private IGeneroRepo generoRepo;

	@Override
	public void agregar(Genero genero) {
		// TODO Auto-generated method stub
		this.generoRepo.insertar(genero);
	}

	@Override
	public void modificar(Genero genero) {
		// TODO Auto-generated method stub
		this.generoRepo.actualizar(genero);
	}

	@Override
	public Genero buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.generoRepo.buscar(id);
	}

	@Override
	public void elminar(Integer id) {
		// TODO Auto-generated method stub
		this.generoRepo.elminar(id);
	}

}
