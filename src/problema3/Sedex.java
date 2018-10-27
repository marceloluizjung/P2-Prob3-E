
package problema3;

public class Sedex implements Entrega {

    private double peso;
    private final double precoAte500 = 12.5;
    private final double precoAte750 = 20;
    private final double precoAte1200 = 30;
    private final double precoAte2000 = 45;

    public Sedex(double peso) {
        this.peso = peso;
    }

    @Override
    public double retornarValorEntrega() {

        if (this.peso > 0 && this.peso <= 0.501) {
            return precoAte500;
        } else if (this.peso >= 0.501 && this.peso < 0.751) {
            return precoAte750;
        } else if (this.peso >= 0.751 && this.peso < 1.201) {
            return precoAte1200;
        } else if (this.peso >= 1.201 && this.peso < 2.001) {
            return precoAte2000;
        } else if (this.peso >= 2) {
            return (((peso - 2) % 0.1) * 1.5) + (((peso - 2) / 0.1) * 1.5) + 45;
        } else {
            throw new IllegalArgumentException("Não é possível escolher esse tipo de entrega pois não existe nada a ser enviado");
        }

    }

}
