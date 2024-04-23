package Desafios;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Nome: Robson de Jesus");
        System.out.println("Tipo Conta: Corrente");
        System.out.println("Saldo inicial: R$: 2500,00");
        System.out.println("******************************* \n");

        int operacao = 0;
        double saldo = 2500;

        while(operacao != 4){

            System.out.println("Operações \n");
            System.out.println("1 - Cosultar saldos \n" +
                    "2 - Receber Valor \n" +
                    "3 - Transferir valor \n" +
                    "4 - Sair\n\n" +
                    "Digite a opção: ");

            operacao = entrada.nextInt();

            if(operacao != 4){

                switch(operacao){
                    case 1:
                        System.out.println("O saldo atual é R$" + saldo);
                        break;
                    case 2:
                        System.out.println("Digite o valor a receber: ");
                        double valorRecebido = entrada.nextDouble();
                        saldo += valorRecebido;
                        System.out.println("Saldo Atualizado R$"+ saldo);
                        break;
                    case 3:
                        System.out.println("Informe o valor que deseja transferir: ");
                        double valor_transferencia = entrada.nextDouble();
                        if(valor_transferencia > saldo){
                            System.out.println("Não há saldo para realizar a transferencia.");
                        }else{
                            saldo -= valor_transferencia;
                            System.out.println("Novo saldo: "+ saldo);
                        }
                        break;
                    case 4:
                        System.out.println("4 - Sair");
                }
            }
        }
    }
}
