package com.app.producto.controller;

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

import com.app.producto.entities.Producto;
import com.app.producto.services.IProductoServices;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

	@Autowired
	private IProductoServices productoService;
	
	@GetMapping("")
	public List<Producto> index(){
		return productoService.findAll();
	}
	
	@GetMapping("/all/{id}")
	public List<Producto> findAllById(@PathVariable Iterable<Long> id){
		return productoService.findAllById(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id){
		return productoService.findById(id);
	}
	
	@PostMapping("")
	public Producto create(@RequestBody Producto producto){
		return productoService.save(producto);
	}
}
