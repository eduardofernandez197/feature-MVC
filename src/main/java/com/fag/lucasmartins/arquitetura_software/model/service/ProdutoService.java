package com.fag.lucasmartins.arquitetura_software.model.service;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;

@Service
public interface ProdutoService {

    public abstract ProdutoBO cadastrarProduto(ProdutoBO produtoBO);

}
