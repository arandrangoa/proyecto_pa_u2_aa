package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IAutorService;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2AaApplication implements CommandLineRunner{

	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	@Autowired IAutorService autorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Ciudadano ciu=new Ciudadano();
		ciu.setNombre("Darllen");
		ciu.setApellido("Calvachi");
		
		Empleado empl= new Empleado();
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setSalario(new BigDecimal(100));
		empl.setCiudadano(ciu);
		ciu.setEmpleado(empl);*/
		//this.ciudadanoService.guardar(ciu);
		//Segundo ejemplo
		/*Ciudadano ciu2= new Ciudadano();
		ciu2.setNombre("Mashiel");
		ciu2.setApellido("Tuquerres");
		
		Empleado empl2=new Empleado();
		empl2.setSalario(new BigDecimal(20));
		empl2.setFechaIngreso(LocalDateTime.now());
		empl2.setCiudadano(ciu2);
		this.ciudadanoService.guardar(ciu2);*/
		
		/*Habitacion habi1=new Habitacion();
		Habitacion habi2=new Habitacion();
		Habitacion habi3=new Habitacion();
		
		
		List<Habitacion> listaHabitaciones=new ArrayList<>();
		listaHabitaciones.add(habi1);
		listaHabitaciones.add(habi2);
		listaHabitaciones.add(habi3);
		
		
		Hotel hotel=new Hotel();
		hotel.setDireccion("Montañita");
		hotel.setNombre("Decameron");
		hotel.setHabitaciones(listaHabitaciones);
		
		
		/*actualihotel.setDireccion("Atacames");
		actualihotel.setHabitaciones(listaHabitaciones);
		actualihotel.setNombre("Diamond");*/
		
		//this.hotelService.agregar(hotel);
		//this.hotelService.encontrar(3);
		
		/*Hotel buscarhotel=this.hotelService.encontrar(4);
		System.out.println(buscarhotel);
		List<Habitacion> listaHabHotel4=buscarhotel.getHabitaciones();
		
			for(Habitacion hab:listaHabHotel4) {
				System.out.println(hab);
		}*/
		
		
		
		/*Habitacion habi4=new Habitacion();
		habi4.setHotel(buscarhotel);
		habi4.setNumero("A1");*/
		//this.habitacionService.agregar(habi4);
		//this.habitacionService.eliminar(24);
		
		//this.habitacionService.eliminar(28);
		
		Libro libro1=new Libro();
		libro1.setNombre("P.Web");
		
		
		Libro libro2=new Libro();
		libro2.setNombre("Redes");
		
		Set<Libro> libros=new HashSet<Libro>();
		libros.add(libro1);
		libros.add(libro2);
		
		Autor autor1=new Autor();
		autor1.setNombre("WS");
		autor1.setLibros(libros);
		
		Set<Autor> autores=new HashSet<Autor>();
		autores.add(autor1);
		
		libro1.setAutores(autores);
		libro2.setAutores(autores)
;		
		this.autorService.agregar(autor1);
		
		
		
		
	}

}
