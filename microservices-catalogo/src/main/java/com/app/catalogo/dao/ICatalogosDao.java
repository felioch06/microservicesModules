package com.app.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.catalogo.models.Catalogo;

public interface ICatalogosDao extends CrudRepository<Catalogo, Long> {

}