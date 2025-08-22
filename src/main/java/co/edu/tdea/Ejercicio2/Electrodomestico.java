package co.edu.tdea.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    private static final double PRECIO_BASE_DEFECTO = 100;
    private static final String COLOR_DEFECTO = "blanco";
    private static final char CONSUMO_DEFECTO = 'F';
    private static final double PESO_DEFECTO = 5;

    private static final List<String> COLORES_VALIDOS = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");

    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO, CONSUMO_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEFECTO, CONSUMO_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return CONSUMO_DEFECTO;
    }

    private String comprobarColor(String color) {
        String colorLower = color.toLowerCase();
        return COLORES_VALIDOS.contains(colorLower) ? colorLower : COLOR_DEFECTO;
    }

    public double precioFinal() {
        double precioFinal = this.precioBase;

        switch (consumoEnergetico) {
            case 'A': precioFinal += 100; break;
            case 'B': precioFinal += 80; break;
            case 'C': precioFinal += 60; break;
            case 'D': precioFinal += 50; break;
            case 'E': precioFinal += 30; break;
            case 'F': precioFinal += 10; break;
        }

        if (peso >= 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }
}