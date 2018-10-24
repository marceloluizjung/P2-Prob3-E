
package problema3;

public class Pac implements Entrega {

    private double peso;

    public Pac(double peso) {
        this.peso = peso;
    }

    @Override
    public double retornarValorEntrega() {

        if (this.peso <= 1) {
            return 10;
        } else if (this.peso <= 2 && this.peso >= 1) {
            return 15;
        } else if (this.peso > 2 && this.peso <= 3) {
            return 20;
        } else if (this.peso > 3 && this.peso <= 5) {
            return 30;
        } else {
            // colocar a classe de exceção para retornar
           
            return 0;
        }

    }

}
