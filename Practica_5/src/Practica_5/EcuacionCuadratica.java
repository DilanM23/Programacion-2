package Practica_5;

public class EcuacionCuadratica {
	private double a, b, c;

    // Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Metodo que calcula el discriminante: b^2 - 4ac
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // Metodo que devuelve la primera raiz si el discriminante es positivo o 0
    public double getRaiz1() {
        if (getDiscriminante() < 0) {
            return Double.NaN; //Retorna "NaN" si no hay solución real
        }
        return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    // Metodo que devuelve la segunda raiz si el discriminante es positivo
    public double getRaiz2() {
        if (getDiscriminante() < 0) {
            return Double.NaN; // Retorna "NaN" si no hay solucion real
        }
        return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
    }
    
    public void mostrarSolucion() {
        double discriminante = getDiscriminante();
        if (discriminante > 0) {
            System.out.println("La ecuacion tiene dos raices: ");
            System.out.println("Raiz 1: " + Math.round(getRaiz1() * 1000000.0) / 1000000.0);
            System.out.println("Raiz 2: " + Math.round(getRaiz2() * 100000.0) / 100000.0);
        } else if (discriminante == 0) {
            System.out.println("La ecuacion tiene una unica raiz:");
            System.out.println("Raiz: " + getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }
    }
}