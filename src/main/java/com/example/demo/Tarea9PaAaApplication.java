package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Computadora;
import com.example.demo.uce.modelo.Genero;

import com.example.demo.uce.modelo.Pelicula;
import com.example.demo.uce.modelo.Procesador;
import com.example.demo.uce.service.IComputadoraService;
import com.example.demo.uce.service.IGeneroService;
import com.example.demo.uce.service.IPeliculaService;
import com.example.demo.uce.service.IProcesadorService;

@SpringBootApplication
public class Tarea9PaAaApplication implements CommandLineRunner{

	/*@Autowired
	private IComputadoraService computadoraService;
	@Autowired
	private IProcesadorService iProcesadorService;*/
	
	@Autowired
	private IGeneroService generoService;
	
	@Autowired
	private IPeliculaService iPeliculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea9PaAaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		/*Computadora c1=new Computadora();
		c1.setModelo("Nitro 5");
		c1.setColor("Negro");
		c1.setMarca("Acer");
		
		Procesador p1=new Procesador();
		p1.setFabricante("Intel");
		p1.setGeneracion("11va Generacion");
		p1.setNumNucleos("8");
		p1.setComputadora(c1);
		
		c1.setProcesador(p1);
		this.computadoraService.agregar(c1);
		this.computadoraService.borrar(1);
		Computadora cBuscar=this.computadoraService.encontrar(2);
		
		cBuscar.setColor("Rojo");
		cBuscar.setMarca("Lenovo");
		cBuscar.setModelo("LenovoPad");
		
		this.computadoraService.modificar(cBuscar);*/
		
		Pelicula pel1=new Pelicula();
		Pelicula pel2=new Pelicula();
		Pelicula pel3=new Pelicula();
		
		List<Pelicula> listaPeliculas=new ArrayList<>();
		listaPeliculas.add(pel1);
		listaPeliculas.add(pel2);
		listaPeliculas.add(pel3);
		
		Genero genero1=new Genero();
		genero1.setAnioOrigen("1980");
		genero1.setTipoGenero("Accion");
		genero1.setPeliculas(listaPeliculas);
		this.generoService.agregar(genero1);
		
		this.generoService.elminar(1);
		Genero buscargenero=this.generoService.buscar(2);
		
		buscargenero.setAnioOrigen("1999");
		buscargenero.setTipoGenero("Comedia");
		
		this.generoService.modificar(buscargenero);
		
	}

}
