package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.SistemaVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.modelo.ClienteVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.modelo.EnderecoVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.modelo.ProdutoVendas;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class AplicacaoSincrona {

    public static void main(String[] args) {
        ProdutoVendas produtoVendas = new ProdutoVendas("Televisão", new BigDecimal("1200.99"));
        ClienteVendas clienteVendas = new ClienteVendas("Welyab Paula", "welyab@email");
        EnderecoVendas enderecoVendas = new EnderecoVendas("São Luís", "MA", "65000-000", "2", "Ao lado da padaria");

        var sistemaVendas = new SistemaVendas();
        sistemaVendas.realizarVenda(clienteVendas, enderecoVendas, produtoVendas, new BigDecimal(2));
    }
}
