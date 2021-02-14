package com.app.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.producto.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
