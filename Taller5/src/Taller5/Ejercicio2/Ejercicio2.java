package Taller5.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("12345", 1000.0, "Ahorros");

        // System.out.println("Número de cuenta: " + cuenta.numeroCuenta);

        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());

        cuenta.setSaldo(1500.0);
        System.out.println("Nuevo saldo de la cuenta: " + cuenta.getSaldo());

        cuenta.mostrarDetalles();
    }
}
