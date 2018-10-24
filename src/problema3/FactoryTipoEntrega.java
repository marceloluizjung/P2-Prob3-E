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
public class FactoryTipoEntrega {


    public Entrega FactoryTipoEntrega(int tipo, double peso) {

        switch (tipo) {

            case 1:
                return new Pac(peso);
            case 2:
                return new Sedex(peso);
            case 3:
                return new RetiraLocal();
            default:
                System.out.println("Escolha um tipo de entrega disponível... 1,2,3");
        }
        return null;

    }

}
