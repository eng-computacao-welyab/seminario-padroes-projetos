package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.financeiro.modelo;

@SuppressWarnings("all")
public class TituloFinanceiro {

    private ItemFinanceiro itemFinanceiro;
    private ClienteFinanceiro clienteFinanceiro;

    public TituloFinanceiro() {
    }

    public TituloFinanceiro(ItemFinanceiro itemFinanceiro, ClienteFinanceiro clienteFinanceiro) {
        this.itemFinanceiro = itemFinanceiro;
        this.clienteFinanceiro = clienteFinanceiro;
    }

    public ItemFinanceiro getItemFinanceiro() {
        return itemFinanceiro;
    }

    public void setItemFinanceiro(ItemFinanceiro itemFinanceiro) {
        this.itemFinanceiro = itemFinanceiro;
    }

    public ClienteFinanceiro getClienteFinanceiro() {
        return clienteFinanceiro;
    }

    public void setClienteFinanceiro(ClienteFinanceiro clienteFinanceiro) {
        this.clienteFinanceiro = clienteFinanceiro;
    }

    @Override
    public String toString() {
        return "TituloFinanceiro{" +
                "itemFinanceiro=" + itemFinanceiro +
                ", clienteFinanceiro=" + clienteFinanceiro +
                '}';
    }
}
