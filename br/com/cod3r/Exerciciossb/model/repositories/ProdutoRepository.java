package br.com.cod3r.Exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.Exerciciossb.model.entities.Produto;


public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer>,
	CrudRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
