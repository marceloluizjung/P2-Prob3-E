package problema3;

public class Motoboy implements Entrega {

    private double peso;
    private final double valorEntrega = 7;
    private final double limitePeso = 25;
    private final double limiteProduto = 30;
    private Pedido pedido;

    public Motoboy(double peso) {
        this.peso = peso;
    }

    public void setPedido(Pedido pedido){ 
        this.pedido = pedido; 
    }
    
    @Override
    public double retornarValorEntrega() {

        if (pedido.getQtdItemPedido() > limiteProduto) {
            if (pedido.getPesoTotalPedido() > limitePeso) {
                return valorEntrega;
            } else {
                throw new IllegalArgumentException("O peso do total do pedido excede o limite permtido! Favor verificar.");
            }
        } else {
            throw new IllegalArgumentException("A quantidade de itens execede o permitido! Favor verificar.");
        }
    }

}
