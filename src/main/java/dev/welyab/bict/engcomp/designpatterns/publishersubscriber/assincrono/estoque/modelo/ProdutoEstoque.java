package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class ProdutoEstoque {

    private String nome;
    private BigDecimal preco;

    public ProdutoEstoque() {
    }

    public ProdutoEstoque(String nome, BigDecimal preco) {
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
        return "ProdutoEstoque{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
