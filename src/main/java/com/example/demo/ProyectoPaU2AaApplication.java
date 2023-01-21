package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2AaApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IProfesorService iProfesorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estu=new Estudiante();
		estu.setNombre("Alex");
		estu.setApellido("Andrango");
		estu.setCedula("1727193847");
		estu.setCiudad("Cuenca");
		estu.setGenero("M");
	
		//this.estudianteService.agregar(estu);
		
		//this.estudianteService.modificar(estu);
		//Estudiante buscar=this.estudianteService.buscar(3);
		//System.out.println(buscar);
		
		Profesor prof=new Profesor();
		prof.setNombre("Guadalupe");
		prof.setApellido("Sandoval");
		prof.setCedula("1713031191");
		prof.setCiudad("Guayaquil");
		prof.setGenero("F");
		
		//this.iProfesorService.agregar(prof);
		Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Alex");
		ciu.setApellido("Apellido");
		
	
		
		
		Empleado empl= new Empleado();
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setSalario(new BigDecimal(100));
		empl.setCiudadano(ciu);
		
		ciu.setEmpleado(empl);
		
		this.ciudadanoService.guardar(ciu);
	}

}
