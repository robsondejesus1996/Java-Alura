package Desafios;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //10%.....
    public double aplicarDesconto(double valor){
        double desconto = (valor / 100) * this.preco;
        double precoAtualizado = this.preco - desconto;
        System.out.println("Desconto de: "+ desconto);
        System.out.println("Seu produto ficou por: " + precoAtualizado);
        return desconto;
    }
}
