package Desafios;

import java.util.ArrayList;

public class PrincipalPessoa1 {

    public static void main(String[] args) {
        ArrayList<Pessoa1> listaDePessoas = new ArrayList<>();

        Pessoa1 p1 = new Pessoa1();
        p1.setNome("Robson");
        p1.setIdade(28);

        Pessoa1 p2 = new Pessoa1();
        p2.setNome("Maysa");
        p2.setIdade(23);

        Pessoa1 p3 = new Pessoa1();
        p3.setNome("Isabela");
        p3.setIdade(29);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);


        System.out.println("Tamanho da lista: "+ listaDePessoas.size());

        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());

        System.out.println("Lista completa: "+ listaDePessoas.toString());

        System.out.println("Lista de Pessoas");

        for(Pessoa1 pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

    }

}
