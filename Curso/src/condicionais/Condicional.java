package condicionais;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1989;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clinetes estão curtindo!");
        }else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
