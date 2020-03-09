package com.springboot.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.cursomc.domain.Categoria;
import com.springboot.cursomc.repositories.CategoriaRepository;

import java.util.Optional;;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
}