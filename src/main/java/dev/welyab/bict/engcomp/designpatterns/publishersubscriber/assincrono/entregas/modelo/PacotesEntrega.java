package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.entregas.modelo;

@SuppressWarnings("all")
public class PacotesEntrega {

    private String numeroEtiqueta;

    public PacotesEntrega() {
    }

    public PacotesEntrega(String numeroEtiqueta) {
        this.numeroEtiqueta = numeroEtiqueta;
    }

    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    public void setNumeroEtiqueta(String numeroEtiqueta) {
        this.numeroEtiqueta = numeroEtiqueta;
    }

    @Override
    public String toString() {
        return "PacotesEntrega{" +
                "numeroEtiqueta='" + numeroEtiqueta + '\'' +
                '}';
    }
}
