package Empleado;

public class Main {
    public static void main(String[] args){

        EmpleadoTiempoCompleto t1 = new EmpleadoTiempoCompleto(20);

        System.out.println("El salario es: " + t1.calcularSalario());
        t1.solicitarLicencia(10);
        t1.solicitarLicencia(30);
        t1.calcularHorasExtras(10);
        t1.tomarVacaciones(15);

    }
}
