package Desafios;

public class Carro {

    String modelo;
    int ano;
    String cor;


    void exibiFichaTecnica(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano Carro: "+ ano);
        System.out.println("Cor do carro: "+ cor);
    }

    void calcularIdade(int anoAtual){
        int idadeF = anoAtual - ano;
        System.out.println("A idade do carro: "+ idadeF);

    }
}
