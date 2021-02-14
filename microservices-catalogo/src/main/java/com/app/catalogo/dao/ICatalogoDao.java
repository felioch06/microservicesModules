package com.app.catalogo.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.catalogo.entities.Catalogo;

public interface ICatalogoDao extends CrudRepository<Catalogo, Long> {

}
