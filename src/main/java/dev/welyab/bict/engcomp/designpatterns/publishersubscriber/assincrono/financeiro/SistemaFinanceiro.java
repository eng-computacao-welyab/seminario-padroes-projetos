package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro;

import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro.modelo.NotaFiscalFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro.modelo.TituloFinanceiro;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.SistemaPagamento;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.modelo.FormaPagamento;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.modelo.InformacoesPagamento;

import java.util.UUID;

@SuppressWarnings("all")
public class SistemaFinanceiro {

    private static final String SISTEMA = "SISTEMA FINANCEIRO";

    public NotaFiscalFinanceiro gerarTitulo(TituloFinanceiro tituloFinanceiro) {
        System.out.printf("%s - Registrando título no sistema financeiro%n", SISTEMA);
        System.out.printf("%s - Realizando pagamento no valor %s%n", SISTEMA, tituloFinanceiro.getItemFinanceiro().getValor());
        System.out.println();

        var sistemaPagamentos = new SistemaPagamento();
        var formaPagamento = new FormaPagamento("Cartão de crédito");
        var informacoesPagamento = new InformacoesPagamento(
                formaPagamento,
                tituloFinanceiro.getClienteFinanceiro().getNome(),
                tituloFinanceiro.getClienteFinanceiro().getEmail(),
                tituloFinanceiro.getItemFinanceiro().getValor()
        );
        sistemaPagamentos.realizarPagamento(informacoesPagamento);

        String chaveNotaFiscal = UUID.randomUUID().toString();
        var notaFiscalFinanceiro = new NotaFiscalFinanceiro(chaveNotaFiscal);

        System.out.printf("%s - Nota fiscal gerada com sucesso%n", SISTEMA);
        System.out.printf("%s - A chave da nota fiscal é %s%n", SISTEMA, chaveNotaFiscal);
        System.out.printf("%s - Nota fiscal armazenada na base de dados%n", SISTEMA);
        System.out.println();

        return notaFiscalFinanceiro;
    }
}
