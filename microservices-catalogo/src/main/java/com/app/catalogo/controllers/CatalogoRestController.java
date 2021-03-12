package com.app.catalogo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.catalogo.models.Catalogo;
import com.app.catalogo.models.Categoria;
import com.app.catalogo.models.Respuesta;
import com.app.catalogo.services.IServicesCatalogo;
import com.app.catalogo.services.ServicesCatalogo;

@RestController
@RequestMapping("/api/catalogos")
public class CatalogoRestController{

	@Autowired
	private IServicesCatalogo servicesCatalogo;
	
	@GetMapping("")
	public List<Respuesta> listar(){
		return servicesCatalogo.findAll();
	}
	
	//@GetMapping("")
	//public List<Respuesta> one(){
	//	return servicesCatalogo.findOne();
	//}

}
