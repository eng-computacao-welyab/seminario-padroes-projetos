package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.sincrono.entregas.modelo;

@SuppressWarnings("all")
public class NotaFiscalEntrega {

    private String chaveNota;

    public NotaFiscalEntrega() {
    }

    public NotaFiscalEntrega(String chaveNota) {
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
        return "NotaFiscalEntrega{" +
                "chaveNota='" + chaveNota + '\'' +
                '}';
    }
}
