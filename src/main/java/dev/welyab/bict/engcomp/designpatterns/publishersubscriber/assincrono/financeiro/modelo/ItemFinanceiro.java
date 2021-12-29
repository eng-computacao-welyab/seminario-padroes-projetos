package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro.modelo;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class ItemFinanceiro {

    private String nome;
    private BigDecimal valor;

    public ItemFinanceiro() {
    }

    public ItemFinanceiro(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ItemFinanceiro{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
