package Desafios;

public class PrincipalProduto {

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Calça");
        produto.setPreco(130);

        produto.aplicarDesconto(30);
    }
}
