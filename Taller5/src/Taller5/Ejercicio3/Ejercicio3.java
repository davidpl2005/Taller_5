package Taller5.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {

        double resultadoSuma = Utilidades.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        double resultadoResta = Utilidades.restar(10, 4);
        System.out.println("Resultado de la resta: " + resultadoResta);

        double resultadoMultiplicacion = Utilidades.multiplicar(7, 2);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = Utilidades.dividir(9, 3);
        System.out.println("Resultado de la división: " + resultadoDivision);

        double resultadoDivisionPorCero = Utilidades.dividir(9, 3);
        System.out.println("Resultado de la división por cero: " + resultadoDivisionPorCero);
    }
}
