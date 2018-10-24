/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author Marcelo
 */
public class Sedex implements Entrega {

    private double peso;

    public Sedex(double peso) {
        this.peso = peso;
    }

    @Override
    public double retornarValorEntrega() {

        if (this.peso <= 0.501) {
            return 12.5;
        } else if (this.peso >= 0.501 && this.peso < 0.751) {
            return 20;
        } else if (this.peso >= 0.751 && this.peso < 1.201) {
            return 30;
        } else if (this.peso >= 1.201 && this.peso < 2.001) {
            return 45;
        } else if (this.peso >= 2) {

            double aux = (((peso - 2) % 0.1) * 1.5) + 45;

            return aux;

        } else {

            // colocar a classe de exceção para retornar
            return 0;
        }

    }

}
