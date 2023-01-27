package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="genero")
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "genp_seq")
	@SequenceGenerator(name="genp_seq",sequenceName = "genp_seq",allocationSize = 1)
	@Column(name="genp_id")
	private Integer id;
	
	@Column(name="genp_tipoGenero")
	private String tipoGenero;
	
	@Column(name="genp_anioOrigen")
	private String anioOrigen;
	
	@OneToMany(mappedBy = "genero", cascade= CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Pelicula> peliculas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public String getAnioOrigen() {
		return anioOrigen;
	}

	public void setAnioOrigen(String anioOrigen) {
		this.anioOrigen = anioOrigen;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	
	
}
