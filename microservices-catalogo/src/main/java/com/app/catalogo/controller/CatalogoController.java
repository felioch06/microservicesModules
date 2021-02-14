package com.app.catalogo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.catalogo.entities.Catalogo;
import com.app.catalogo.services.ICatalogoServices;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogoController {

	@Autowired
	private ICatalogoServices catalogoService;
	
	@GetMapping("")
	public List<Catalogo> index(){
		return catalogoService.findAll();
	}
	
	@GetMapping("/fk")
	public List<Catalogo> fk(){
		return catalogoService.findAllFk();
	}
	
	
	@GetMapping("/{id}")
	public Optional<Catalogo> ver(@PathVariable Long id){
		return catalogoService.findById(id);
	}
	
	@PostMapping("")
	public Catalogo create(@RequestBody Catalogo catalogo){
		return catalogoService.save(catalogo);
	}
}

