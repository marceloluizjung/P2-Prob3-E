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
public class TipoEntregaStrategy {

    private static TipoEntregaStrategy instanciaSingleton = new TipoEntregaStrategy();

    private TipoEntregaStrategy() {
    }

    public static synchronized TipoEntregaStrategy getSingleton() {
        return instanciaSingleton;
    }

    public Entrega getTipoEntrega(int tipo, double peso) throws TipoEntregaInvalido {
        if (tipo == 1) {
            return new Pac(peso);
        } else if (tipo == 2) {
            return new Sedex(peso);
        } else if (tipo == 3) {
            return new RetiraLocal();
        } else {
            throw new TipoEntregaInvalido("Escolha um tipo de entrega disponível: 1,2,3");
        }
    }

}
