package Empleado;

public class EmpleadoTiempoCompleto implements Empleado,TrabajadorExtra {

    private double salarioBase;
    private int licenciaPendiente;

    public EmpleadoTiempoCompleto(int licenciaPendiente){
        this.salarioBase = 1000;
        this.licenciaPendiente = licenciaPendiente;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase;
    }

    @Override
    public void solicitarLicencia(int dias) {
        if(this.licenciaPendiente > dias){
            System.out.println("Licencia aprobada");
        }else{
            System.out.println("Licencia denegada");
        }
    }

    @Override
    public void calcularHorasExtras(int horas) {
        double extra;
        double precioHora;
        precioHora = this.salarioBase / 160;
        extra = precioHora * horas * 1.5;
        System.out.println("El pago con horas extras es: " + (this.salarioBase + extra));
    }

    @Override
    public void tomarVacaciones(int dias) {
        System.out.println("Se han solicitado: " + dias + " de vacaciones");
        System.out.println("Operación confirmada");
    }
}
