package br.com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade,Integer>{
}