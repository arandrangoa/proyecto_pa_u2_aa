package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
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
		Habitacion habi1=new Habitacion();
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
		
		Hotel actualihotel=this.hotelService.encontrar(2);
		actualihotel.setDireccion("Atacames");
		actualihotel.setHabitaciones(listaHabitaciones);
		actualihotel.setNombre("Diamond");
		
		this.hotelService.agregar(hotel);
		this.hotelService.borrar(1);
		this.hotelService.modificar(actualihotel);
		
		
		
		
		
		
		
		
	}

}
