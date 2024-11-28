package Taller5.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan Pérez", 3500.0);
        
        System.out.println("Nombre del empleado: " + empleado.nombre);
        System.out.println("Salario del empleado: " + empleado.getSalario());

        empleado.setSalario(500.0);  // Salario no valido
        
        System.out.println("Salario después del intento de cambio: " + empleado.getSalario());
    }
}
