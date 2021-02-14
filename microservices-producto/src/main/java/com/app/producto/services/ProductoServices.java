package com.app.producto.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.producto.dao.IProductoDao;
import com.app.producto.entities.Producto;

@Service
@Primary
public class ProductoServices implements IProductoServices{

	@Autowired
	private IProductoDao productoDao;
	
	@Transactional(readOnly = true)
	public List<Producto> findAll(){
		return (List<Producto>) productoDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<Producto> findAllById(Iterable<Long> id){
		return (List<Producto>) productoDao.findAllById(id);
	}
	
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id){
		return productoDao.findById(id);
	}
	
	@Transactional(readOnly = false)
	public Producto save(Producto dependencia){
		return productoDao.save(dependencia);
	}
}
