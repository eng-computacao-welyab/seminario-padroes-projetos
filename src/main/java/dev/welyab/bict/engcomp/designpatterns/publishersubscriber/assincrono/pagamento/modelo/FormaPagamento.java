package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.pagamento.modelo;

@SuppressWarnings("all")
public class FormaPagamento {

    private String nome;

    public FormaPagamento() {
    }

    public FormaPagamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
