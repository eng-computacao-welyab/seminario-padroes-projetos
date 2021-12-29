package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.EnderecoEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.NotaFiscalEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo.PacotesEntrega;

@SuppressWarnings("all")
public class SistemaEntrega {

    private static final String SISTEMA = "SISTEMA DE ENTREGAS";

    public void realizarEntrega(NotaFiscalEntrega notaFiscalEntrega, EnderecoEntrega enderecoEntrega, PacotesEntrega pacotesEntrega) {
        System.out.printf("%s - Pedido pronto para entrega%n", SISTEMA);
        System.out.printf("%s - O número da nota fiscal é %s%n", SISTEMA, notaFiscalEntrega.getChaveNota());
        System.out.printf("%s - O endereço de entrega%s%n", SISTEMA, enderecoEntrega);
        System.out.printf("%s - O número da etiqueta é%s%n", SISTEMA, pacotesEntrega.getNumeroEtiqueta());
    }
}
