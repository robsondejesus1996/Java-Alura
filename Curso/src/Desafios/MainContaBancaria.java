package Desafios;

import java.util.ArrayList;

public class MainContaBancaria {
    //Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

    public static void main(String[] args) {
        ContaBancaria2 conta1 = new ContaBancaria2(101, 1500.00);
        ContaBancaria2 conta2 = new ContaBancaria2(102, 2500.00);
        ContaBancaria2 conta3 = new ContaBancaria2(103, 1800.00);

        ArrayList<ContaBancaria2> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);


        ContaBancaria2 contaMaiorSaldo = listaContas.get(0);

        for(ContaBancaria2 conta: listaContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());    }
}
