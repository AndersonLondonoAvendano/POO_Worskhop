package co.edu.tdea.Ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Mamifero ballena = new Ballena("Océano", true);
        Mamifero elefante = new Elefante("Sabana", false);

        Mamifero[] mamiferos = {ballena, elefante};

        for (Mamifero m : mamiferos) {
            m.imprimirInfo();
            m.moverMamiferos();
            m.alimentarMamiferos();
            System.out.println("---------------------");
        }
    }
}
