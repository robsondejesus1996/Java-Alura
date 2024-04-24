package exemplos;

public class PrincipalFilme {

    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.nome = "Duna 2";
        filme.duracaoEmMinutos = 200;
        filme.anoDeLancamento = 2024;
        filme.incluidoNoPlano = true;


        filme.exibeFichaTecnica();


        filme.avalia(10);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("A media de avaliação desse filme: "+ filme.pegaMedia());
    }
}
