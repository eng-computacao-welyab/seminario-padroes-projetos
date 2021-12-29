package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.estoque.modelo;

@SuppressWarnings("all")
public class EnderecoEstoque {

    private String cidade;
    private String estado;
    private String cep;
    private String numero;
    private String complemento;

    public EnderecoEstoque() {
    }

    public EnderecoEstoque(String cidade, String estado, String cep, String numero, String complemento) {
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "EnderecoEstoque{" +
                "cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
