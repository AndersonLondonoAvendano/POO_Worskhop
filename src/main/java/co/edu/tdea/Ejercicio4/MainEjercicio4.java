package co.edu.tdea.Ejercicio4;

public class MainEjercicio4 {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Anderson");
        cuenta1.ingresar(500);
        cuenta1.retirar(200);
        cuenta1.mostrar();

        Cuenta cuenta2 = new Cuenta("Laura", 1000);
        cuenta2.retirar(1200);
        cuenta2.mostrar();
    }

}
