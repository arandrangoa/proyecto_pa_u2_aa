package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")

//PRINCIPAL
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_vehi")
	@SequenceGenerator(name="seq_vehi",sequenceName = "seq_vahi",allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	
	@Column(name="vehi_color")
	private String color;
	
	@Column(name="vehi_placa")
	private String placa;
	
	@Column(name="vehi_modelo")
	private String modelo;
	
	@Column(name="vehi_fabricante")
	private String fabricante;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="vehiculo_cliente",
	joinColumns = @JoinColumn(name="vecl_id_vehi"),
	inverseJoinColumns = @JoinColumn(name="vecl_id_clie"))
	private Set<Cliente> clientes;
	
	//GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	

}
