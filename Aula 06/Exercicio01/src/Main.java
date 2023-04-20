public class Main {

    public static void main(String[] args) throws Exception {
        Circulo c = new Circulo(2, "Vermelho");
        System.out.println("\n" + c.toString());

        Triangulo t = new Triangulo(3, 4, "Verde");
        System.out.println(t.toString());

        Retangulo r = new Retangulo(5, 6, "Azul");
        System.out.println(r.toString());

        Quadrado q = new Quadrado(7, "Amarelo");
        System.out.println(q.toString() + "\n");
    }
}