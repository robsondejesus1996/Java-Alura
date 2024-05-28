package exemplos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {

    public static void main(String[] args) {
        //Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}
