package Desafios;

import java.util.ArrayList;

public class MainArrayList {

//    Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
    public static void main(String[] args) {

        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        for(String elemento : listaStrings)
            System.out.println(elemento);

    }
}
