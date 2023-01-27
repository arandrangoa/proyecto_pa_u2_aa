package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="procesador")
@Entity
public class Procesador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proc_seq")
	@SequenceGenerator(name="proc_seq",sequenceName = "proc_seq",allocationSize = 1)
	@Column(name="proc_id")
	private Integer id;
	
	@Column(name="proc_fabricante")
	private String fabricante;
	
	@Column(name="proc_generacion")
	private String generacion;
	
	@Column(name="proc_numNucleos")
	private String numNucleos;

	@OneToOne()
	@JoinColumn(name="proc_id_computadora")
	private Computadora computadora;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public String getNumNucleos() {
		return numNucleos;
	}

	public void setNumNucleos(String numNucleos) {
		this.numNucleos = numNucleos;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	
	
}
