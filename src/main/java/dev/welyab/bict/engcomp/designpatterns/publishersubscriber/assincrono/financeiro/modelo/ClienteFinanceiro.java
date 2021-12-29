package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro.modelo;

@SuppressWarnings("all")
public class ClienteFinanceiro {

    private String nome;
    private String email;

    public ClienteFinanceiro() {
    }

    public ClienteFinanceiro(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ClienteFinanceiro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
