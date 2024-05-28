package exemplos;

public class TituloListas implements Comparable<TituloListas>{

    //Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

    String nome;


    @Override
    public int compareTo(TituloListas outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
