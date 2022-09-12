package com.gmc.api.entity;

import java.util.Date;


import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Albums")
public class Album {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer Id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "lanzado")
	private Date lanzado;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "precio")
	private Double precio;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getLanzado() {
		return lanzado;
	}

	public void setLanzado(Date lanzado) {
		this.lanzado = lanzado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Album [titulo=" + titulo + ", genero=" + genero + ", precio=" + precio + "]";
	}
	
	
	
}
