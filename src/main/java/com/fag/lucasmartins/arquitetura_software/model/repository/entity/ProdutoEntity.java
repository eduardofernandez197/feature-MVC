package com.fag.lucasmartins.arquitetura_software.model.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class ProdutoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome ;
    private Integer estoque ;
    private double preco;
    private int id;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Integer estoque, int id, String nome, double preco) {
        this.estoque = estoque;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
