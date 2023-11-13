import java.util.Scanner;

public class PiramidePrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas;

        do {
            System.out.println("Ingrese el número de filas para la pirámide:");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido:");
                scanner.next();
            }
            filas = scanner.nextInt();
        } while (filas <= 0);

        System.out.println("Seleccione el tipo de pirámide:");
        System.out.println("1. Pirámide de Asteriscos");
        System.out.println("2. Pirámide de Letras");

        int opcion;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese 1 o 2:");
                scanner.next();
            }
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 2);

        switch (opcion) {
            case 1:
                dibujarPiramideAsteriscos(filas);
                break;
            case 2:
                dibujarPiramideLetras(filas);
                break;
        }
    }

    private static void dibujarPiramideAsteriscos(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void dibujarPiramideLetras(int filas) {
        int valor = 1;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                char letra = (char) ('A' + valor - 1);
                System.out.print(letra);
                valor++;
            }
            System.out.println();
        }
    }
}
