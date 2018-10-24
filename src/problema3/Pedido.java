package problema3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private Entrega entrega;
    private double pesoTotal;
    FactoryTipoEntrega fac;

    public Pedido() {
        fac = new FactoryTipoEntrega();
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

    protected Entrega escolhaTipoEntrega(int tipo) {
        System.out.println("Escolha o tipo de entrega 1, 2, 3");
        entrega = fac.FactoryTipoEntrega(tipo, this.pesoTotal);
        return entrega;
    }
    
    protected double getValorEntrega(){
        return entrega.retornarValorEntrega();
    }

    protected double getValorTotal() {
        double aux = this.getValorPedido() + this.getValorEntrega();
        System.out.println("O valor total da entrega foi de :" + aux);
        return aux;
    }

}
