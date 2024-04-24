package Desafios;

public class Musica {

    String tilulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Tilulo: " + tilulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes ++;
    }

    double media(){
        return avaliacao/numAvaliacoes;
    }


}
