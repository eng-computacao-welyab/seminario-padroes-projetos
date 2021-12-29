package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.mensagens;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.entregas.SistemaEntrega;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.SistemaPagamento;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.estoque.SistemaEstoque;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.SistemaFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.vendas.SistemaVendas;

import javax.jms.Message;
import javax.jms.MessageListener;

@SuppressWarnings("all")
public class MessageSubscriber implements MessageListener {

    private SistemaEntrega sistemaEntrega = new SistemaEntrega();
    private SistemaEstoque sistemaEstoque = new SistemaEstoque();
    private SistemaFinanceiro sistemaFinanceiro = new SistemaFinanceiro();
    private SistemaPagamento sistemaPagamento = new SistemaPagamento();
    private SistemaVendas sistemaVendas = new SistemaVendas();

    @Override
    public void onMessage(Message message) {
        // notificações
    }
}
