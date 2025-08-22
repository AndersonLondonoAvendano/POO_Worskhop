package co.edu.tdea.Ejercicio1;

abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public void imprimir() {
        System.out.println("Figura de color: " + color);
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}