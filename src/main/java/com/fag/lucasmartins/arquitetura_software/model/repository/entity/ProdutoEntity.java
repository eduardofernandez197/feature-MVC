package com.fag.lucasmartins.arquitetura_software.model.repository.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id; 
    private String nome;
    private Integer estoque;
    private double preco;

    
    public ProdutoEntity() {
    }

    public ProdutoEntity(Integer estoque, Long id, String nome, double preco) {
        this.id = id;
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }


   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

   
}