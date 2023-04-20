public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.setCor(cor);
    }

    public double area() {
        return ((this.base * this.altura) / 2);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "O Triângulo " + this.getCor() + " de base " + this.base + " e altura " + this.altura + " possui área " + this.area();
    }
}