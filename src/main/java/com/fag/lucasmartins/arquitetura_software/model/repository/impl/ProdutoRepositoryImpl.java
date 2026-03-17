package com.fag.lucasmartins.arquitetura_software.model.repository.impl;

import org.springframework.stereotype.Component;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.ProdutoRepository;
import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.model.repository.jpa.ProdutoRepositoryJpa;
import com.fag.lucasmartins.arquitetura_software.model.repository.mapper.ProdutoEntityMapper;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository{

    private final ProdutoRepositoryJpa jpaRepository;

    public ProdutoRepositoryImpl(ProdutoRepositoryJpa jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
    
    @Override
    public ProdutoBO salvar(ProdutoBO bo) {
        ProdutoEntity entity = ProdutoEntityMapper.toEntity(bo);

        ProdutoEntity produtoCadastrado = jpaRepository.save(entity);

        return ProdutoEntityMapper.toBO(produtoCadastrado);
    }
}
