package com.libna.mc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libna.mc.domain.Categoria;
import com.libna.mc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) { 
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElse(null); 
	}
}
