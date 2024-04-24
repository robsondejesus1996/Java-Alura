package exemplos;

public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void exibeFichaTecnica(){

        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
        System.out.println("Está incluido no plano: "+ incluidoNoPlano);
        System.out.println("Duração do Filme: " + duracaoEmMinutos);

    }

    void avalia(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
