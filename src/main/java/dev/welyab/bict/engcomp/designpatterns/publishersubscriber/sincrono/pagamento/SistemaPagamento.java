package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.pagamento;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.pagamento.modelo.InformacoesPagamento;

@SuppressWarnings("all")
public class SistemaPagamento {

    private static final String SISTEMA = "SISTEMA DE PAGAMENTOS";

    public void realizarPagamento(InformacoesPagamento informacoesPagamento) {
        System.out.printf("%s - Solicitação de pagamento recebida%n", SISTEMA);
        System.out.printf("%s - A forma de pagamento escolhida é '%s'%n", SISTEMA, informacoesPagamento.getFormaPagamento().getNome());
        System.out.printf("%s - O cliente debitado será %s%n", SISTEMA, informacoesPagamento.getNomeCliente());
        System.out.printf("%s - O valor do pagamento será de %s%n", SISTEMA, informacoesPagamento.getValor());
        System.out.printf("%s - O pagamento foi confirmado%n", SISTEMA);
        System.out.println();
    }
}
