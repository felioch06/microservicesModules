package com.app.catalogo.entities;

import java.io.Serializable; 
import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity 
@Table( name = "CATALOGO" ) 
public class Catalogo implements Serializable{ 
	private static final long serialversionUID = 1L; 
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "ID_CATALOGO_PK", nullable = false )
	private Long id;
	
	@Column( name = "NOMBRE", nullable = false) 
	private String nombre;
	
	public Catalogo() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this. id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + "]";
	}
}
