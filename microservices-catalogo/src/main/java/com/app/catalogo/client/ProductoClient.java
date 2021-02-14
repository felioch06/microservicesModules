package com.app.catalogo.client;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.catalogo.entities.Producto;

@FeignClient(name = "servicio-productos")
public interface ProductoClient {

	@GetMapping("")
	public List<Producto> listar();
	
	@GetMapping("/{id}")
	public Optional<Producto> ver(@PathVariable Long id);
}
