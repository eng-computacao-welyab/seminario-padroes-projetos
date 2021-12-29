package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.SistemaEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo.ClienteEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo.EnderecoEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo.PedidoEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo.ProdutoEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.ClienteVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.EnderecoVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.ProdutoVendas;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class SistemaVendas {

    private static final String SISTEMA = "SISTEMA DE VENDAS";

    public void realizarVenda(
            ClienteVendas clienteVendas,
            EnderecoVendas enderecoVendas,
            ProdutoVendas produtoVendas,
            BigDecimal quantidade
    ) {
        System.out.printf("%s - Pedido de venda recebido%n", SISTEMA);
        System.out.printf("%s - %s%n", SISTEMA, clienteVendas);
        System.out.printf("%s - %s%n", SISTEMA, enderecoVendas);
        System.out.printf("%s - %s%n", SISTEMA, produtoVendas);
        System.out.printf("%s - Quantidade=%s%n", SISTEMA, quantidade);
        System.out.printf("%s - Pedido de venda salva no banco de dados%n", SISTEMA, quantidade);
        System.out.printf("%s - E-mail de confirmação enviado para o cliente%n", SISTEMA, produtoVendas);
        System.out.printf("%s - Enviando pedido para o sistema de estoque%n", SISTEMA);
        System.out.println();

        var sistemaEstoque = new SistemaEstoque();
        var clienteEstoque = new ClienteEstoque(clienteVendas.getNome(), clienteVendas.getEmail());
        var enderecoEstoque = new EnderecoEstoque(
                enderecoVendas.getCidade(),
                enderecoVendas.getEstado(),
                enderecoVendas.getCep(),
                enderecoVendas.getNumero(),
                enderecoVendas.getComplemento()
        );
        var produtoEstoque = new ProdutoEstoque(produtoVendas.getNome(), produtoVendas.getPreco());
        var pedidoEstoque = new PedidoEstoque(clienteEstoque, enderecoEstoque, produtoEstoque, quantidade);
        sistemaEstoque.fazerPedido(pedidoEstoque);
    }
}
