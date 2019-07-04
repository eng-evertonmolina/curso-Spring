package br.com.cursomc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursomc.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

}
