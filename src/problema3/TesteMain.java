package problema3;

public class TesteMain {

    public static void main(String[] args) {
        //Tipo entrega
        final int tipoEntrega = 2;

        //Criando pedido
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        //Criando produto
        Produto produto1 = new Produto("Café Promoção", 1.0, 1);

        //Add item ao pedido 
        pedido1.incluirItem(produto1, 1);
        try {
            pedido1.escolhaTipoEntrega(tipoEntrega);
            System.out.println(pedido1.getValorEntrega());
            System.out.println(pedido1.getValorPedido());
            System.out.println(pedido1.getValorTotal());
        } catch (TipoEntregaInvalido tei) {
            System.out.println("Erro: " + tei.getMessage());
        }

        //Teste singleton 
        if(pedido1.testeSingleton() == pedido2.testeSingleton()){
            System.out.println("Singleton Ok");
        }
        
    }

}
