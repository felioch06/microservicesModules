package com.app.categoria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.categoria.entities.Categorias;
import com.app.categoria.services.ICategoriasServices;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasRestController {

	@Autowired
	private ICategoriasServices categoriaServices;
	
	@GetMapping("/{id}")
	public Optional<Categorias> ver(@PathVariable Long id){
		return categoriaServices.findById(id);
	}
	
	@PostMapping("")
	public void create(@RequestBody Categorias categoria){ 
		categoriaServices.create(categoria); 
	} 
	
	@GetMapping("")
	public List<Categorias> listar(){
		return categoriaServices.findAll();
	}
	
	//@GetMapping("")
	//public List<Categorias> one(){
	//	return categoriaServices.findOne();
	//}
}

