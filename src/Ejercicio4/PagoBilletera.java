package Ejercicio4;

public class PagoBilletera extends MetodoPago {

    private String email;

    public PagoBilletera(String titular, String email){
        super(titular);
        this.email = email;
    }

    void procesarPago(double monto){
        System.out.println("Nombre titular: " + getTitular());
        System.out.println("Email: " + this.email);
        System.out.println("Monto indicado: " + monto);
    }
}
