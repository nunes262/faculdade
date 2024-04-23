package classes;

public class Solicitação {
    private Cliente cliente;
    private String descricao;

    public Solicitação(Cliente cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }
}
