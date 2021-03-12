package com.app.categoria.services;

import java.util.List;
import java.util.Optional;

import com.app.categoria.entities.Categorias;

public interface ICategoriasServices {

	public Optional<Categorias> findById(Long id);

	public void create(Categorias categoria);
	
	public List<Categorias> findAll();

	//public List<Categorias> findOne();
	

}

