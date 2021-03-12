package com.app.categoria.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.categoria.dao.ICategoriasDao;
import com.app.categoria.entities.Categorias;
import com.app.categoria.services.ICategoriasServices;

@Service
public class CategoriasServices implements ICategoriasServices{

	@Autowired
	private ICategoriasDao categoriaDao;
	
	@Transactional(readOnly = true)
	public Optional<Categorias> findById(Long id) {
		return categoriaDao.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void create(Categorias categoria){
		categoriaDao.save(categoria);
	}

	@Transactional(readOnly = true)
	public List<Categorias> findAll() {
		return (List<Categorias>) categoriaDao.findAll();
	}
	
	//@Transactional(readOnly = true)
	//public List<Categorias> findOne() {
	//	return (List<Categorias>) categoriaDao.findOne();
	//}
	
}
