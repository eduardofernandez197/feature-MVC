package com.fag.lucasmartins.arquitetura_software.model.service.impl;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;

@Service
public class ProdutoServiceimpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceimpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoBO cadastrarProduto(ProdutoBO produtoBO) {

       
        produtoBO.calcularDesconto();
        produtoBO.verificacaoPremium();

      
        ProdutoBO produtoSalvo = produtoRepository.salvar(produtoBO);

        return produtoSalvo;
    }
}