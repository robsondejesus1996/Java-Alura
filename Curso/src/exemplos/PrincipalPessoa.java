package exemplos;

public class PrincipalPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;


        System.out.println(pessoa1.nome + " tem "+ pessoa1.idade + " anos de idade");


        pessoa1.fazAniversario();

        System.out.println("A idade agora é: "+ pessoa1.idade);
    }
}
