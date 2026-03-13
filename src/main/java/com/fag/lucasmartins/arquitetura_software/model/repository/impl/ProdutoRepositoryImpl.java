package com.fag.lucasmartins.arquitetura_software.model.repository.impl;

import org.springframework.stereotype.Component;

import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;
import com.fag.lucasmartins.arquitetura_software.model.repository.mapper.ProdutoEntityMapper;

@Component
public class ProdutoRepositoryImpl implements ProdutoRepository{

    private final ProdutoJpaRepository jpaRepository;

    public ProdutoRepositoryImpl(ProdutoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
    
    @Override
    public ProdutoBO salvar(ProdutoBO bo) {
        ProdutoEntity entity = ProdutoEntityMapper.toEntity(bo);

        ProdutoEntity produtoCadastrado = jpaRepository.save(entity);

        return ProdutoEntityMapper.toBO(produtoCriado);
    }
}
