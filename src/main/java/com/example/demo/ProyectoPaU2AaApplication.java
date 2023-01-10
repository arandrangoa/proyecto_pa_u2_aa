package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2AaApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estu=new Estudiante();
		estu.setNombre("Darleen");
		estu.setApellido("Calvachi");
		estu.setCedula("1714458237");
		estu.setCiudad("Quito");
		estu.setGenero("F");
		
		this.estudianteService.agregar(estu);
		
		//
		
		//this.estudianteService.modificar(estu);
		
		//Estudiante buscar=this.estudianteService.buscar(3);
		//System.out.println(buscar);
		
		
	}

}
