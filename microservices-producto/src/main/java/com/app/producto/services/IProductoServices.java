package com.app.producto.services;

import java.util.List;
import java.util.Optional;

import com.app.producto.entities.Producto;
public interface IProductoServices {

	public List<Producto> findAll();
	
	public List<Producto> findAllById(Iterable<Long> id);
	
	public Optional<Producto> findById(Long id);
	
	public Producto save(Producto producto);
	
}
