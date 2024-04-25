package br.com.alura.screenmatch.modelos;

public class Filme {

    public String nome;
    public int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void exibiFichaTecnica(){
        System.out.println("Nome do filme "+ nome);
        System.out.println("Ano de lançamento "+ anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;

    }


    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

}
