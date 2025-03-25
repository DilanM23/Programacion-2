package Practica_5;
import java.util.Scanner;

public class Estadistica {
    private float promedio;
    private float desviacion;
    private int n;
    private float[] datos;

    // Constructor
    public Estadistica() {
        this.n = 0;
        this.datos = new float[0];
    }

    // Calcular el promedio
    void promedio() {
        if (n == 0) {
            System.out.println("No existen Datos!");
            return;
        }
        float suma = 0;
        for (int i = 0; i < n; i++) {
            suma=suma+ datos[i];
        }
        promedio = suma / n;
        System.out.println("El Promedio es: " +Math.round(promedio * 100.0) / 100.0);
        
    }

    // Calcular la desviacion
    void desviacion() {
        if (n == 0) {
            System.out.println("No existen Datos!");
            return;
        }
        float sumaCuadrados = 0;
        for (int i = 0; i < n; i++) {
            sumaCuadrados += Math.pow(datos[i]-promedio, 2);
        }
        desviacion = (float) Math.sqrt(sumaCuadrados/(n-1));
        System.out.println("La Desviacion Estandar es: " + Math.round(desviacion * 100000.0) / 100000.0);
    }

    // Llenar los datos
    public void llenar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Intro. cantidad de datos: ");
        this.n = leer.nextInt();
        this.datos = new float[n]; 

        System.out.println("Intro. los datos:");
        for (int i = 0; i < n; i++) {
            this.datos[i] = leer.nextFloat();
        }
    }

    // Mostrar
    public void mostrar() {
        if (n == 0) {
            System.out.println("No existen datos.");
            return;
        }
        System.out.print("Datos: ");
        for (int i = 0; i < n; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}