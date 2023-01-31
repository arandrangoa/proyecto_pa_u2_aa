package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.repository.IAutorRepo;

@Service
public class IAutorServiceImpl implements IAutorService{
	
	@Autowired
	private IAutorRepo autorRepo;

	@Override
	public void agregar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

}
