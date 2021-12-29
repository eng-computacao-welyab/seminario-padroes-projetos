package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.modelo;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class ProdutoVendas {

    private String nome;
    private BigDecimal preco;

    public ProdutoVendas() {
    }

    public ProdutoVendas(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
