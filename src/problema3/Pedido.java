package problema3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private Entrega entrega;
    private double pesoTotal;
    private TipoEntregaStrategy fac = TipoEntregaStrategy.getSingleton();

   

    public Pedido() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

    public double getPesoTotalPedido() {
        double valorPeso = 0;
        for (ItemPedido ip : this.itens) {
            valorPeso += (ip.getPesoTotalItem());
        }
        return valorPeso;
    }

    public Entrega escolhaTipoEntrega(int tipo) throws TipoEntregaInvalido {
        entrega = fac.getTipoEntrega(tipo, this.getPesoTotalPedido());
        return entrega;
    }

    public double getValorEntrega() {
        return entrega.retornarValorEntrega();
    }

    public double getValorTotal() {
        return this.getValorPedido() + this.getValorEntrega();
    }

    public TipoEntregaStrategy testeSingleton() {
        return fac;
    }

    public int getQtdItemPedido() {
        return itens.size();
    }
}
