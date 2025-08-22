package co.edu.tdea.Ejercicio3;

abstract class Mamifero implements ComportamientoMamiferos {
    private String tipoAnimal;
    private String habitat;
    private boolean peligroExt;

    public Mamifero(String tipoAnimal, String habitat, boolean peligroExt) {
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.peligroExt = peligroExt;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isPeligroExt() {
        return peligroExt;
    }

    public void imprimirInfo() {
        System.out.println("Tipo: " + tipoAnimal + ", Hábitat: " + habitat +
                ", En peligro de extinción: " + (peligroExt ? "Sí" : "No"));
    }
}