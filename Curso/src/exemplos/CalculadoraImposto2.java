package exemplos;

public class CalculadoraImposto2 {


    private double totalImposto = 0;

    public void calculaImposto(Tributavel2 tributavel2){
        totalImposto += tributavel2.calculaImposto();
    }
}
