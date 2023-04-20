public class Quadrado extends Retangulo {
    
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "O Quadrado " + this.getCor() + " de lado " + this.getLado1() + " possui área " + this.area();
    }
}