package Ejercicio5;

public class Main {
    public static void main(String[] args){

        EntradaVIP e1 = new EntradaVIP("IDJ#432",18);
        EntradaGeneral e2 = new EntradaGeneral("JJD92323%",15);

        e1.mostrarDatos();
        System.out.println(e1.validarEntrada());
        e2.mostrarDatos();
        System.out.println(e2.validarEntrada());
    }
}
