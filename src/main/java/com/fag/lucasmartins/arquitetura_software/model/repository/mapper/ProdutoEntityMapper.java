package com.fag.lucasmartins.arquitetura_software.model.repository.mapper;

import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;

public class ProdutoEntityMapper {

    public static ProdutoEntity toEntity(ProdutoBO bo) {

        ProdutoEntity entity = new ProdutoEntity();

        entity.setId(bo.getId());      
        entity.setNome(bo.getNome());
        entity.setPreco(bo.getPreco());
        entity.setEstoque(bo.getEstoque());

        return entity;
    }

    public static ProdutoBO toBO(ProdutoEntity entity) {

        ProdutoBO bo = new ProdutoBO();
                entity.getId();
                entity.getNome();
                entity.getEstoque();
                entity.getPreco();
             
        return bo;
    }
}