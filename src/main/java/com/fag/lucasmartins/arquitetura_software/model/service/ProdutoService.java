package com.fag.lucasmartins.arquitetura_software.model.service;

import org.springframework.stereotype.Service;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;

public interface ProdutoService {

    ProdutoBO salvar(ProdutoBO produtoBO);
}
