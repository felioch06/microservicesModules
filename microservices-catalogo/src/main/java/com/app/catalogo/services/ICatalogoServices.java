package com.app.catalogo.services;

import java.util.List;
import java.util.Optional;

import com.app.catalogo.entities.Catalogo;
public interface ICatalogoServices {

	public List<Catalogo> findAll();
	
	public List<Catalogo> findAllFk();
	
	public Optional<Catalogo> findById(Long id);
	
	public Catalogo save(Catalogo catalogo);
	
}
