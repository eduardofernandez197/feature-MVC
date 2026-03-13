package com.fag.lucasmartins.arquitetura_software.model.bo;

public class ProdutoBO {
    private String nome ;
    private Integer estoque ;
    private double preco;
    private int id;

    public ProdutoBO(int id,String nome, Integer estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.id = id;
    }

    public ProdutoBO() {

    }

    public void verificacaoPremium (){
     if (nome != null && nome.toLowerCase().contains("premium")) {
                if (preco < 100.0) {
                    throw new RuntimeException("Erro: Produtos Premium não podem custar menos de R$ 100,00.");
                    
                }
            }
    }

    public void calcularDesconto() {
        double precoFinal = preco;
            if (estoque != null && estoque >= 50) {
                precoFinal = preco - (preco * 0.10); // 10%
            }
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
