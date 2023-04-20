public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.setCor(cor);
    }

    public double area() {
        return (Math.PI * (Math.pow(raio, 2)));
    }

    public double getDiametro() {
        return (this.raio * 2);
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public String toString() {
        return "O Círculo " + this.getCor() + " de raio " + this.raio + " possui diâmetro " + this.getDiametro() + " e área " + this.area();
    }
}