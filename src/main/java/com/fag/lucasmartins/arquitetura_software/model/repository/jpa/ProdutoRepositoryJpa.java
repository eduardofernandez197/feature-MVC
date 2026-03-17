package com.fag.lucasmartins.arquitetura_software.model.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fag.lucasmartins.arquitetura_software.model.repository.entity.ProdutoEntity;

public interface ProdutoRepositoryJpa extends JpaRepository<ProdutoEntity, Long> {
    
}
