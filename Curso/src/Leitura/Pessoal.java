package Leitura;

import java.util.Scanner;

public class Pessoal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();


        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite o valor que pretende investir nesse mes: ");
        double valor = entrada.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mes.");

        entrada.close();


    }
}
