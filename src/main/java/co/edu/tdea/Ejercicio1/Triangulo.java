package co.edu.tdea.Ejercicio1;

class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(String color, double base, double altura, double lado1, double lado2) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }
}