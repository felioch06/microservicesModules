package com.app.categoria.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.app.categoria.clientes.ProductoClients;
import com.app.categoria.models.Categoria;

@Service
@Primary
public class ServiceCategoria implements IServiceCategoria{

	@Autowired
	private ProductoClients clientFeign;
	
	@Override
	public List<Categoria> findAll(){
		return clientFeign.listar().stream().map(p -> new Categoria()).collect(Collectors.toList());
	}

	
}



