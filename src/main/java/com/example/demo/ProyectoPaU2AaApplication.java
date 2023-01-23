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
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2AaApplication implements CommandLineRunner{

	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Darllen");
		ciu.setApellido("Calvachi");
		this.ciudadanoService.guardar(ciu); 
		this.ciudadanoService.borrar(20);
		Ciudadano ciubusqueda=this.ciudadanoService.encontrar(11);
		System.out.println(ciubusqueda);
		
	
		
		Empleado empl= new Empleado();
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setSalario(new BigDecimal(100));
		empl.setCiudadano(ciu);
		ciu.setEmpleado(empl);
		
		this.empleadoService.agregar(empl);
		this.empleadoService.borrar(10);
		Empleado emplbusqueda=this.empleadoService.encontrar(6);
		//System.out.println(emplbusqueda);
		
		
	}

}
