public class App {
    public static void main(String[] args) throws Exception {

        // Atividade 01
        int x = 10;
        x += 5;
        System.out.println("\n Atividade 01: " + x);

        // Atividade 02
        String a2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("\n Atividade 02: " + a2.toUpperCase());

        // Atividade 03
        String a3a = "Hello, ";
        String a3b = "World!";
        System.out.println("\n Atividade 03: " + a3a + a3b + " e " + a3a.concat(a3b));

        // Atividade 04
        String a4 = "O aprendizado tem sido excelente";
        System.out.println("\n Atividade 04: " + a4.indexOf("e"));

        // Atividade 05
        int y = 5;
        System.out.println("\n Atividade 05: O maior número é o de " + ((x >= y) ? "x" : "y"));

        // Atividade 06
        int a6 = 256;
        System.out.println("\n Atividade 06: " + Math.sqrt(a6));

        // Atividade 07
        System.out.println("\n Atividade 07: " + Math.random() + "\n");
    }
}