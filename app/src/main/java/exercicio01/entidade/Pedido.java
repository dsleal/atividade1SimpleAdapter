package exercicio01.entidade;


import java.math.BigDecimal;

public class Pedido {
    protected long id;
    protected String cliente;
    protected String data;
    protected String produto;
    protected BigDecimal valor;

    public Pedido(long id, String cliente, String data, String produto, BigDecimal valor) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.produto = produto;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Pedido() {
    }

    @Override
    public String toString(){
        return "Pedido{cliente =  " + cliente + '\'' +
                ", produto='" + produto+ '\'' +
                '}';
    }

}

