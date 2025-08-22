package co.edu.tdea.Ejercicio3;

class Ballena extends Mamifero {
    public Ballena(String habitat, boolean peligroExt) {
        super("Ballena", habitat, peligroExt);
    }

    @Override
    public void moverMamiferos() {
        System.out.println("La ballena nada grandes distancias en el océano.");
    }

    @Override
    public void alimentarMamiferos() {
        System.out.println("La ballena se alimenta de krill y pequeños peces.");
    }
}
