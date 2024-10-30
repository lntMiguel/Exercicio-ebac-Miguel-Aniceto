package br.com.miguel.ProdutoService.useCase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.miguel.ProdutoService.exception.EntityNotFoundException;
import br.com.miguel.ProdutoService.models.Produto;
import br.com.miguel.ProdutoService.models.Produto.Status;
import br.com.miguel.ProdutoService.repository.IProdutoRepository;

@Service
public class BuscaProduto {

	private IProdutoRepository produtoRepository;
	
	@Autowired
	public BuscaProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Page<Produto> buscar(Pageable pageable) {
		return (Page<Produto>) produtoRepository.findAll();
	}
	
	public Page<Produto> buscar(org.springframework.data.domain.Pageable pageable, Status status) {
		return produtoRepository.findAllByStatus(pageable, status);
	}

	public Produto buscarPorCodigo(String codigo) {
		return produtoRepository.findByCodigo(codigo)
				.orElseThrow(() -> new EntityNotFoundException(Produto.class, "codigo", codigo));
	}


	
}