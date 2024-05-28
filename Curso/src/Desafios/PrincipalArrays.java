package Desafios;

import java.util.ArrayList;

public class PrincipalArrays {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Robson");
        lista.add("Samuel");
        lista.add("Rafael");

        for (String item: lista) {
            System.out.println(item.toString());

        }
    }
}
