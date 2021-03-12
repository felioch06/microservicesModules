package com.app.catalogo.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Respuesta {
	
	private Long id_categoria;
	private String nombre_categoria;
	private String descripcion_categoria;
	private Producto producto;
	
	public Respuesta(Categoria categoria, Producto producto) {
		this.id_categoria = categoria.getId();
		this.nombre_categoria = categoria.getNombre();	
		this.descripcion_categoria = categoria.getDescripcion();	
		this.producto = producto;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public String getDescripcion_categoria() {
		return descripcion_categoria;
	}

	public void setDescripcion_categoria(String descripcion_categoria) {
		this.descripcion_categoria = descripcion_categoria;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Response [id_categoria=" + id_categoria + ", nombre_categoria=" + nombre_categoria
				+ ", descripcion_categoria=" + descripcion_categoria + ", producto=" + producto + "]";
	}
	
	
	
}
