package co.edu.tdea.Ejercicio1;
import java.util.ArrayList;
import java.util.List;


public class MainEjercicio1{

    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Triangulo("Rojo", 10, 5, 7, 8));
        figuras.add(new Rectangulo("Azul", 8, 4));
        figuras.add(new Cuadrado("Verde", 6));
        figuras.add(new Circulo("Amarillo", 5));

        for (Figura figura : figuras) {
            figura.imprimir();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("-------------------");
        }
    }
}