package br.com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursomc.exceptions.ObjectNotFoundException;
import br.com.cursomc.model.Categoria;
import br.com.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService  {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional <Categoria> obj = repo.findById(id);	
		return	obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: " + id
					+ ", tipo: " +  Categoria.class.getName()));
	}
}
