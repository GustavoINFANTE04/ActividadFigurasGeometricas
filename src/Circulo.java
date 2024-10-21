public class Circulo extends Figura {
    private double radio;
    private final double PI = 3.1416;


    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Radio: " + radio + ", Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro() + "]";
    }
}
