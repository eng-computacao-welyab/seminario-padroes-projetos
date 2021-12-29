package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.financeiro.modelo;

@SuppressWarnings("all")
public class NotaFiscalFinanceiro {

    private String chaveNota;

    public NotaFiscalFinanceiro() {
    }

    public NotaFiscalFinanceiro(String chaveNota) {
        this.chaveNota = chaveNota;
    }

    public String getChaveNota() {
        return chaveNota;
    }

    public void setChaveNota(String chaveNota) {
        this.chaveNota = chaveNota;
    }

    @Override
    public String toString() {
        return "NotaFiscalFinanceiro{" +
                "chaveNota='" + chaveNota + '\'' +
                '}';
    }
}
