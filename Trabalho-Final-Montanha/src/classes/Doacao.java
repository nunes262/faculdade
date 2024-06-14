package classes;

import java.util.Date;

public class Doacao {
    private String tipo;
    private Object quantidade;
    private Date data;

    public Doacao(String tipo, Object quantidade, Date data) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", data=" + data +
                '}';
    }

    public boolean isDinheiro() {
        return quantidade instanceof Double;
    }
}
