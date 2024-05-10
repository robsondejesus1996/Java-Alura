package Desafios;

import java.util.ArrayList;

public class PrincipalProdutos2 {

    public static void main(String[] args) {

        ArrayList<Produto1> listaProdutos = new ArrayList<>();

        Produto1 produto1 = new Produto1("Iphone 1 pro", 10000, 10);

        Produto1 produto2 = new Produto1("Xiome Redmi 13", 15000, 100);


        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        //Imprimir o tamanho da lista
        System.out.println("Tamanho da lista produtos: "+ listaProdutos.size());

        //Recuperação do indice da lista
        System.out.println("Produto 1 nome: " + listaProdutos.get(0).toString());


        //com o for
        for(Produto1 produto: listaProdutos){
            System.out.println(produto);
        }


        Produto1 produto3 = new Produto1("Novo do produto", 10000, 1);
        listaProdutos.add(produto3);
        System.out.println("Produto 3: " + listaProdutos.get(2).toString());


        ProdutoPerecivel pv = new ProdutoPerecivel("Leite", 6.50, 10, "20/05/2024");
        listaProdutos.add(pv);
//        System.out.println("Produto perecivel: "+ listaProdutos.get(3).toString());
        System.out.println(pv.toString());

    }
}
