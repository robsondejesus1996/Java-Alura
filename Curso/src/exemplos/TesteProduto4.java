package exemplos;

public class TesteProduto4 {
    public static void main(String[] args) {
        Produto4 p1 = new Produto4("Caneta", 1.50);
        Produto4 p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
        System.out.println(p2.getPreco());
    }
}
