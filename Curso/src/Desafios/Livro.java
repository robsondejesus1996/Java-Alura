package Desafios;

public class Livro {

    private String autor;
    private String titulo;


    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    void exibirDetalhes(){
        System.out.println("Nome do autor: "+ this.autor);
        System.out.println("Titulo do livro: "+ this.titulo);
    }
}
