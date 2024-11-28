package Taller5.Ejercicio3;

public class Utilidades {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;  // Retorna "Not a Number" en caso de error
        }
        return a / b;
    }
}
