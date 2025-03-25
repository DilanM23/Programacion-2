package Practica_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ESTADISTA
		/*
		Estadistica e1 = new Estadistica();
		e1.llenar();
		e1.mostrar();
		e1.promedio();
		e1.desviacion();
		*/
		//Ecuacion Cuadratica
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Intro. el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Intro. el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Intro. el valor de c: ");
        double c = scanner.nextDouble();
        
        // a!=0
        if (a == 0) {
            System.out.println("El valor de 'a' es 0.");
        } 
        else {
            EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
            ecuacion.mostrarSolucion();
        }
	}
}