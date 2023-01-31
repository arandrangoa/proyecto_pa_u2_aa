package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insetar(vehiculo);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(id);
	}

}
