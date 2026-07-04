package ec.edu.puce;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--- CALCULADORA ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Ingrese un numero valido");
                scanner.next(); 
                continue;
            }
            opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Adios");
                break;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion no valida");
                continue;
            }
        }
    }
}