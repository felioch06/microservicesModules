package com.app.producto.services;

import java.util.List;
import java.util.Optional;

import com.app.producto.entities.Producto;

public interface IProductoServices {
	
	public Optional<Producto> findById(Long id);

	public void create(Producto producto);

	public List<Producto> findAll();
	
	//public List<Producto> findAll();
	

}

