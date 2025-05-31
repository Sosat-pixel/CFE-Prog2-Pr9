package Ejercicio4;

public class PagoTarjeta extends MetodoPago {

    private int numeroTarjeta;

    public PagoTarjeta(String titular, int numeroTarjeta){
        super(titular);
        this.numeroTarjeta = numeroTarjeta;
    }


    @Override
    void procesarPago(double monto) {
        System.out.println("Nombre titular: " + getTitular() );
        System.out.println("Numero de tarjeta: " + this.numeroTarjeta);
        System.out.println("Monto indicado: " + monto);
    }
}
