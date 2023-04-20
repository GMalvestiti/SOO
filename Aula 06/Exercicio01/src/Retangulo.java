public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.setCor(cor);
    }

    public double area() {
        return (this.lado1 * this.lado2);
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "O Retângulo " + this.getCor() + " de lados " + this.lado1 + " e " + this.lado2 + " possui área " + this.area();
    }
}