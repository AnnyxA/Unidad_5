public class Metodos {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicación: " + multiplicacion(num1, num2));
        System.out.println("División: " + division(num1, num2));
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; 
        }
    }
}