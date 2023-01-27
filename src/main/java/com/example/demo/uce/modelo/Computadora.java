package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="computadora")
@Entity
public class Computadora {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "comp_seq")
	@SequenceGenerator(name="comp_seq",sequenceName = "comp_seq",allocationSize = 1)
	@Column(name="comp_id")
	private Integer id;
	
	@Column(name="comp_marca")
	private String marca;
	
	@Column(name="comp_modelo")
	private String modelo;
	
	@Column(name="comp_color")
	private String color;
	
	@OneToOne(mappedBy = "computadora",cascade = CascadeType.ALL)
	private Procesador procesador;
	
	//SET Y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	

}
