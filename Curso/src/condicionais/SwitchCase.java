package condicionais;

public class SwitchCase {

    public static void main(String[] args) {

        int dia = 3;
        String nomeDia;


        switch (dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia Inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
