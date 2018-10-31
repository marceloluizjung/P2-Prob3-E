package problema3;

public class Produto {

    private String descricao;
    private double valor;
    private double peso;

    /**
     * @param descricao
     * @param valor
     * @param peso
     */
    public Produto(String descricao, double valor, int peso) {
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setPeso(peso);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso do produto deve ser acima de ZERO");
        } else {
            this.peso = (peso/1000);
        }
    }
}
