package com.fag.lucasmartins.arquitetura_software.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fag.lucasmartins.arquitetura_software.controller.mapper.ProdutoDTOMapper;
import com.fag.lucasmartins.arquitetura_software.model.bo.ProdutoBO;
import com.fag.lucasmartins.arquitetura_software.model.service.ProdutoService;
import com.fag.lucasmartins.arquitetura_software.view.dto.ProdutoDTO;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrarProduto(@RequestBody ProdutoDTO dto) {
        
        ProdutoBO produtobo = ProdutoDTOMapper.toBo(dto);

        ProdutoBO produtoCadastradoBO = produtoService.cadastrarProduto(produtobo);

        ProdutoDTO produtoCadastradoDTO = ProdutoDTOMapper.toDto(produtoCadastradoBO);

        return ResponseEntity
                .status(201)
                .body(produtoCadastradoDTO);
    }




        }
