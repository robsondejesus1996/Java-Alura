package Desafios;

public class MainAnimal {

    public static void main(String[] args) {
//        Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.


//        Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.?

        Animal2 animal2 = new Cachorro2();

        if(animal2 instanceof Cachorro2){
            Cachorro2 cachorro2 = (Cachorro2) animal2;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
            System.out.println("O objeto é um cachorro");
        }else{
            System.out.println("O objeto não é um cachorro");
        }

    }
}
