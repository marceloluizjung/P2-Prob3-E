package problema3;

class ItemPedido {

    private Produto produto;
    private int quantidade;
    private double pesoTotalItem;
    

    /**
     * @param produto
     * @param quantidade
     */
    protected ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Deve ser definido um produto");
        } else {
            this.produto = produto;
        }
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de itens de pedido deve ser maior que ZERO");
        } else {
            this.quantidade = quantidade;
        }
    }

    protected double getValorItem() {
        return this.quantidade * this.produto.getValor();
    }
    
    protected double getPesoTotalItem(){
        return (this.quantidade * this.produto.getPeso());
    }
   
        
        
    }

