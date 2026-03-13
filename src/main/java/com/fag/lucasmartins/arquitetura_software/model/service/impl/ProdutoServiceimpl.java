package com.fag.lucasmartins.arquitetura_software.model.service.impl;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoServiceImpl;

@Service
public class ProdutoServiceimpl implements ProdutoService{
   
    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoBO cadastrarProduto(Produto BO produtoBO) {

        return produtoRepository.salvar(produtoBO);
    }
}
