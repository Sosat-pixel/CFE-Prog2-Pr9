package Ejercicio4;

public class Main {
    public static void main(String[] args){

        PagoTarjeta p1 = new PagoTarjeta("Paco",213213123);
        PagoBilletera p2 = new PagoBilletera("Jose","elJose@email.com");

        p1.procesarPago(100);
        p2.procesarPago(350);
    }
}
