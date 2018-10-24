
package problema3;

public class Pac implements Entrega {

    private double peso;
    private final int precoAte1 = 10; 
    private final int precoAte2 = 15; 
    private final int precoAte3 = 20; 
    private final int precoAte5 = 30; 
                  

    public Pac(double peso) {
        this.peso = peso;
    }

    @Override
    public double retornarValorEntrega() {

        if (this.peso <= 1) {
            return precoAte1;
        } else if (this.peso <= 2 && this.peso >= 1) {
            return precoAte2;
        } else if (this.peso > 2 && this.peso <= 3) {
            return precoAte3;
        } else if (this.peso > 3 && this.peso <= 5) {
            return precoAte5;
        } else {
            // colocar a classe de exceção para retornar
            return 0;
        }
    }
}
