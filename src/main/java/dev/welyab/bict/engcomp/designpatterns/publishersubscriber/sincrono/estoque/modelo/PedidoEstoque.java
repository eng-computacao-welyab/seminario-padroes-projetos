package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.estoque.modelo;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class PedidoEstoque {

    private ClienteEstoque clienteEstoque;
    private EnderecoEstoque enderecoEstoque;
    private ProdutoEstoque produtoEstoque;
    private BigDecimal quantidade;

    public PedidoEstoque() {
    }

    public PedidoEstoque(ClienteEstoque clienteEstoque, EnderecoEstoque enderecoEstoque, ProdutoEstoque produtoEstoque, BigDecimal quantidade) {
        this.clienteEstoque = clienteEstoque;
        this.enderecoEstoque = enderecoEstoque;
        this.produtoEstoque = produtoEstoque;
        this.quantidade = quantidade;
    }

    public ClienteEstoque getCliente() {
        return clienteEstoque;
    }

    public void setCliente(ClienteEstoque clienteEstoque) {
        this.clienteEstoque = clienteEstoque;
    }

    public EnderecoEstoque getEndereco() {
        return enderecoEstoque;
    }

    public void setEndereco(EnderecoEstoque enderecoEstoque) {
        this.enderecoEstoque = enderecoEstoque;
    }

    public ProdutoEstoque getProduto() {
        return produtoEstoque;
    }

    public void setProduto(ProdutoEstoque produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PedidoEstoque{" +
                "clienteEstoque=" + clienteEstoque +
                ", enderecoEstoque=" + enderecoEstoque +
                ", produtoEstoque=" + produtoEstoque +
                ", quantidade=" + quantidade +
                '}';
    }
}
