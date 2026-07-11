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
                System.out.println("Gracias por utilizar el programa");
                break;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion no valida");
                continue;
            }
            
            System.out.print("Primer numero: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un numero valido");
                scanner.next();
                System.out.print("Primer numero: ");
            }
            double num1 = scanner.nextDouble();

            System.out.print("Segundo numero: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Ingrese un numero valido");
                scanner.next();
                System.out.print("Segundo numero: ");
            }
            double num2 = scanner.nextDouble();
            
            switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
        }

    } while (opcion != 5);

    scanner.close();
}
}