package com.app.categoria.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categorias implements Serializable{

	private static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID_CATEGORIA_PK", nullable = false)
	private Long id;
	
	@Column( name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column( name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	
	public Categorias() {
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categorias [id=" + id + ", nombre_categoria=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
