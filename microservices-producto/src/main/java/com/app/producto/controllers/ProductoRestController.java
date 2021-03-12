package com.app.producto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.producto.entities.Producto;
import com.app.producto.services.IProductoServices;

@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

	@Autowired
	private IProductoServices productoServices;
	
	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id){
		return productoServices.findById(id);
	}
	
	@PostMapping("")
	public void create(@RequestBody Producto producto){ 
		productoServices.create(producto); 
	} 
	
	@GetMapping("")
	public List<Producto> listar(){
		return productoServices.findAll();
	}
	
	
	
	//@GetMapping("")
		//public List<Categorias> one(){
		//	return categoriaServices.findOne();
		//}
}

