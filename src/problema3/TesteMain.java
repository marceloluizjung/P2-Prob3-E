package problema3;

public class TesteMain {
    
    
    
    public static void main(String[] args) {
        
        //Criando pedido
    Pedido pedido1 = new Pedido();

    //Criando produto
    Produto produto1 = new Produto("Café Promoção",2.0,2); 
    
    //Item Pedido 
    ItemPedido itemPedido1 = new ItemPedido(produto1,1);
    
    //Add item ao pedido 
  
    pedido1.incluirItem(produto1, 1);
    try{
    pedido1.escolhaTipoEntrega(1);
    } catch (TipoEntregaInvalido tei){
        tei.getMessage();
    }
    
        System.out.println(pedido1.getValorEntrega());
        System.out.println(pedido1.getValorPedido());
        System.out.println(pedido1.getValorTotal());
    
        
        
    }
    
    
}
