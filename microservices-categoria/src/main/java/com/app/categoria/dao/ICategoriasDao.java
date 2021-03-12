package com.app.categoria.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.categoria.entities.Categorias;

public interface ICategoriasDao extends CrudRepository<Categorias, Long> {

}
