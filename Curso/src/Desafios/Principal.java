package Desafios;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.exibiOla();

        System.out.println("***********************************");
        Calculadora cal = new Calculadora();
        cal.dobroValor(4);


        System.out.println("***********************************");

        Musica mus = new Musica();
        mus.tilulo = "Bla bla";
        mus.artista = "Mario";
        mus.anoLancamento = 2024;

        mus.exibirFichaTecnica();

        mus.avalia(10);
        mus.avalia(5);
        mus.avalia(10);


        System.out.println("A media de avaliações: "+ mus.media());

        System.out.println("***********************************");


        Carro carro = new Carro();
        carro.modelo = "Argo";
        carro.ano = 1970;
        carro.cor = "Branco";

        carro.exibiFichaTecnica();

        carro.calcularIdade(2024);
    }
}
