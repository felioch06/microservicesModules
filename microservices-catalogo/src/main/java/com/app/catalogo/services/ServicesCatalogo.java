package com.app.catalogo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.app.catalogo.dao.ICatalogosDao;
import com.app.catalogo.models.Catalogo;
import com.app.catalogo.models.Categoria;
import com.app.catalogo.models.Producto;
import com.app.catalogo.models.Respuesta;


@Service
public class ServicesCatalogo implements IServicesCatalogo{

	@Autowired
	private RestTemplate clienteRest;
	
	@Autowired
	private ICatalogosDao catalogoDao;
	
	@Transactional(readOnly = true)
	public List<Respuesta> findAll(){
		
		List<Respuesta> listResponse = new ArrayList<Respuesta>();
		List<Catalogo> list = new ArrayList<Catalogo>();
		
		for (Catalogo catalogo : list) {
			
			Long idProducto = (Long) catalogo.getId_producto();
			Producto producto = (Producto) clienteRest.getForObject("http://localhost:51478/api/productos/"+ idProducto, Producto.class);
		
			Long idCategoria = (Long) catalogo.getId_categoria();
			Categoria categoria= (Categoria) clienteRest.getForObject("http://localhost:51515/api/categorias/"+ idCategoria, Categoria.class);
		
			Respuesta objRes = new Respuesta(categoria,producto);
			
			System.out.println(objRes.toString());
			
			listResponse.add(objRes);
		}
		
		return listResponse;
	}
	
}	
