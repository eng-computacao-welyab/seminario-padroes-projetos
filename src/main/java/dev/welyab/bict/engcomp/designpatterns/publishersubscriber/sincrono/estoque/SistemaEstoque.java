package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.estoque;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.SistemaEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.EnderecoEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.NotaFiscalEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.PacotesEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.estoque.modelo.PedidoEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.SistemaFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.modelo.ClienteFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.modelo.ItemFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.modelo.TituloFinanceiro;

@SuppressWarnings("all")
public class SistemaEstoque {

    private static final String SISTEMA = "SISTEMA DE ESTOQUE";

    public void fazerPedido(PedidoEstoque pedidoEstoque) {
        System.out.printf("%s - Pedido recebido no estoque%n", SISTEMA);
        System.out.printf("%s - %s%n", SISTEMA, pedidoEstoque.getCliente());
        System.out.printf("%s - %s%n", SISTEMA, pedidoEstoque.getEndereco());
        System.out.printf("%s - %s%n", SISTEMA, pedidoEstoque.getProduto());
        System.out.printf("%s - Quantidade=%s%n", SISTEMA, pedidoEstoque.getQuantidade());
        System.out.printf("%s - Produtos reservados no estoque%n", SISTEMA);
        System.out.printf("%s - Solicitando nota fiscal%n", SISTEMA);
        System.out.println();

        var sistemaFinanceiro = new SistemaFinanceiro();
        var tituloFinanceiro = new TituloFinanceiro();
        var clienteFinanceiro = new ClienteFinanceiro(pedidoEstoque.getCliente().getNome(), pedidoEstoque.getCliente().getEmail());
        tituloFinanceiro.setClienteFinanceiro(clienteFinanceiro);
        var valorTotal = pedidoEstoque.getProduto().getPreco().multiply(pedidoEstoque.getQuantidade());
        var itemFinanceiro = new ItemFinanceiro(pedidoEstoque.getProduto().getNome(), valorTotal);
        tituloFinanceiro.setItemFinanceiro(itemFinanceiro);
        var notaFiscalFinanceiro = sistemaFinanceiro.gerarTitulo(tituloFinanceiro);

        System.out.printf("%s - Nota fiscal registrada no estoque%n", SISTEMA);
        System.out.printf("%s - Chave da nota fiscal: %s%n", SISTEMA, notaFiscalFinanceiro.getChaveNota());
        System.out.printf("%s - Produtos baixados do estoque%n", SISTEMA);
        System.out.printf("%s - Solicitando entrega dos pedidos%n", SISTEMA);
        System.out.println();

        var sistemaEntregas = new SistemaEntrega();
        var enderecoEntrega = new EnderecoEntrega(
                pedidoEstoque.getEndereco().getCidade(),
                pedidoEstoque.getEndereco().getEstado(),
                pedidoEstoque.getEndereco().getCep(),
                pedidoEstoque.getEndereco().getNumero(),
                pedidoEstoque.getEndereco().getComplemento()
        );
        var notaFiscalEntrega = new NotaFiscalEntrega(notaFiscalFinanceiro.getChaveNota());
        var pacoteEntrega = new PacotesEntrega("XPTO-WD9652");
        sistemaEntregas.realizarEntrega(notaFiscalEntrega, enderecoEntrega, pacoteEntrega);
    }
}
