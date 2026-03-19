package com.fag.lucasmartins.arquitetura_software.model.service.impl;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public ProdutoBO salvar(ProdutoBO produtoBO) {
        produtoBO.validarPrecoProdutoPremium();
        produtoBO.calcularPrecoFinalPorEstoqueBaixo();

        return produtoRepository.salvar(produtoBO);
    }
}
