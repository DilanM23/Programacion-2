package Practica_9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== Teatro Municipal ===");
            System.out.println("1. Comprar Boleto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("\nTipo de Boleto:");
                System.out.println("1. Palco");
                System.out.println("2. Platea");
                System.out.println("3. Galeria");
                System.out.print("Seleccione tipo: ");
                int tipo = leer.nextInt();
                System.out.print("Ingrese numero de boleto: ");
                int numero = leer.nextInt();
                Boleto boleto = null;
                switch (tipo) {
                    case 1:
                        boleto = new Palco(numero);
                        break;
                    case 2:
                        System.out.print("Ingrese dias de anticipacion: ");
                        int diasPlatea = leer.nextInt();
                        boleto = new Platea(numero, diasPlatea);
                        break;
                    case 3:
                        System.out.print("Ingrese dias de anticipacion: ");
                        int diasGaleria = leer.nextInt();
                        boleto = new Galeria(numero, diasGaleria);
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        continue;
                }
                System.out.println("\nInformacion del Boleto:");
                System.out.println(boleto.toString());
            }
        } 
        while (opcion != 2);
	}
}