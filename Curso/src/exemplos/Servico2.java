package exemplos;

public class Servico2 extends Item implements Tributavel2{


    private int quantidadeHoras;


    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calculaImposto() {
        return getPreco() * 0.12;
    }
}
