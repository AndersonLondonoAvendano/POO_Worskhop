package co.edu.tdea.Ejercicio3;

class Elefante extends Mamifero {

    public Elefante(String habitat, boolean peligroExt) {
        super("Elefante", habitat, peligroExt);
    }

    @Override
    public void moverMamiferos() {
        System.out.println("El elefante camina largas distancias en busca de agua y alimento.");
    }

    @Override
    public void alimentarMamiferos() {
        System.out.println("El elefante se alimenta de hierbas, frutas y cortezas de árbol.");
    }
}