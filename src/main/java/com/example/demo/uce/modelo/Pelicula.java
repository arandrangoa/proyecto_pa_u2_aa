package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "peli_seq") 
	@SequenceGenerator(name="peli_seq", sequenceName = "peli_seq", allocationSize = 1)
	@Column(name="peli_id")
	private Integer id;
	
	@Column(name="peli_nombre")
	private String nombre;
	
	@Column(name="peli_duracion")
	private String duracion;
	
	@Column(name="peli_idioma")
	private String idioma;
	
	@ManyToOne
	@JoinColumn(name="peli_id_genero")
	private Genero genero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Genero getGeneroPelicula() {
		return genero;
	}

	public void setGeneroPelicula(Genero generoPelicula) {
		this.genero = generoPelicula;
	}
	
	

}
