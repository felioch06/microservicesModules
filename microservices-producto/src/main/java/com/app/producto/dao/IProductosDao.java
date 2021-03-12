package com.app.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.producto.entities.Producto;

public interface IProductosDao extends CrudRepository<Producto, Long> {

}
