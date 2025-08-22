package co.edu.tdea.Ejercicio4;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
        this.titular = "";
        this.cantidad = 0.0;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void mostrar() {
        System.out.println("Titular: " + titular + " | Cantidad: $" + cantidad);
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }
}