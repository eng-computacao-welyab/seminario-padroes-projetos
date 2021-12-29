package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.modelo;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class InformacoesPagamento {

    private FormaPagamento formaPagamento;
    private String nomeCliente;
    private String emailCliente;
    private BigDecimal valor;

    public InformacoesPagamento() {
    }

    public InformacoesPagamento(FormaPagamento formaPagamento, String nomeCliente, String emailCliente, BigDecimal valor) {
        this.formaPagamento = formaPagamento;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "InformacoesPagamento{" +
                "formaPagamento=" + formaPagamento +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", emailCliente='" + emailCliente + '\'' +
                ", valor=" + valor +
                '}';
    }
}
