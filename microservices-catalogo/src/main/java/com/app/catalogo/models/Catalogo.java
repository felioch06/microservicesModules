package com.app.catalogo.models;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATALOGOS")
public class Catalogo implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name = "ID_CATALOGO_PK", nullable = false)
	private Long id_catalogo;
	
	@Column( name = "ID_CATEGORIA", nullable = false)
	private Long id_categoria;
	
	@Column( name = "ID_PRODUCTO", nullable = false)
	private Long id_producto;
	
	private Catalogo() {
	}

	public Long getId_catalogo() {
		return id_catalogo;
	}

	public void setId_catalogo(Long id_catalogo) {
		this.id_catalogo = id_catalogo;
	}

	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}
	
}
