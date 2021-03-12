package com.app.catalogo.services;

import java.util.List;

import com.app.catalogo.models.Catalogo;
import com.app.catalogo.models.Categoria;
import com.app.catalogo.models.Respuesta;

public interface IServicesCatalogo {
	
	public List<Respuesta> findAll();
	
	//public List<Respuesta> findOne();
}
