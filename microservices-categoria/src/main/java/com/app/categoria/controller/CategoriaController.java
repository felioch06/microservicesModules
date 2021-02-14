package com.app.categoria.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.categoria.models.Categoria;
import com.app.categoria.services.ServiceCategoria;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

	@Autowired
	private ServiceCategoria serviceCategoria;
	
	@GetMapping("")
	public List<Categoria> listar(){
		return serviceCategoria.findAll();
	}
	
}
