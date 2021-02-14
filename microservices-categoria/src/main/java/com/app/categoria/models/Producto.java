package com.app.categoria.models;

public class Producto{ 
	private static final long serialversionUID = 1L; 
	
	private Long id;
	
	private String nombre;
	
	private Double precio;

	public Producto() {
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
