package com.projetofaculdade.demo.model;

// Herda de Produto 
public class ProdutoEspecial extends Produto {
    private String beneficio;

    public ProdutoEspecial() {}

    public ProdutoEspecial(Long id, String nome, Double preco, String beneficio) {
        super(id, nome, preco); 
        this.beneficio = beneficio;
    }

    public String getBeneficio() { return beneficio; }
    public void setBeneficio(String beneficio) { this.beneficio = beneficio; }
}