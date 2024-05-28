package Desafios;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {
//        Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.


        Produto2 produto1 = new Produto2("Ar condicionado", 2000.00);
        Produto2 produto2 = new Produto2("Aquecedor", 800.00);
        Produto2 produto3 = new Produto2("Ventilador", 150.0);

        ArrayList<Produto2> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);


        double somaPrecos = 0;
        for (Produto2 produto : listaProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
