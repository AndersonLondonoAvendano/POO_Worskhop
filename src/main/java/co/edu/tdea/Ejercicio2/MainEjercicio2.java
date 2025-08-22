package co.edu.tdea.Ejercicio2;

public class MainEjercicio2 {

    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico(200, 30);
        Electrodomestico e3 = new Electrodomestico(300, 70, "Rojo", 'B');

        System.out.println("Electrodoméstico 1 -> Color: " + e1.getColor() + ", Precio Final: $" + e1.precioFinal());
        System.out.println("Electrodoméstico 2 -> Color: " + e2.getColor() + ", Precio Final: $" + e2.precioFinal());
        System.out.println("Electrodoméstico 3 -> Color: " + e3.getColor() + ", Precio Final: $" + e3.precioFinal());
    }
}
