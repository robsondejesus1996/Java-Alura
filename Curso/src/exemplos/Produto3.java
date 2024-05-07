package exemplos;

public class Produto3 extends Item implements Tributavel2{

    private double peso;


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaImposto() {
        return getPreco() * 0.1;
    }


}
