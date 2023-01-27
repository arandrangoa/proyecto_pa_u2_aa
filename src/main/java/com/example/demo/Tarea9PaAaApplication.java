package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Computadora;
import com.example.demo.uce.modelo.Procesador;
import com.example.demo.uce.service.IComputadoraService;
import com.example.demo.uce.service.IProcesadorService;

@SpringBootApplication
public class Tarea9PaAaApplication implements CommandLineRunner{

	@Autowired
	private IComputadoraService computadoraService;
	@Autowired
	private IProcesadorService iProcesadorService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea9PaAaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Computadora c1=new Computadora();
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
		
		this.computadoraService.modificar(cBuscar);
		
		
		
		
		
		
	}

}
