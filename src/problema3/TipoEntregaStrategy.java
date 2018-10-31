package problema3;

public class TipoEntregaStrategy {

    private static TipoEntregaStrategy instanciaSingleton = new TipoEntregaStrategy();

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
        } else if (tipo == 4) {
            return new Motoboy(peso);
        } else{
            throw new TipoEntregaInvalido("Escolha um tipo de entrega disponível: 1,2,3");
        }

    }

}
