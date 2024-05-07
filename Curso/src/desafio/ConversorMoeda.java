package desafio;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.07;
        double valoReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valoReal);
    }
}
