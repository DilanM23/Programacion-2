package Practica_7;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private Random rand;
    private Scanner scanner;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        rand = new Random();
        scanner = new Scanner(System.in);
    }
    /*
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = rand.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10:");
        while(true) {
            int intento = scanner.nextInt();
            if(intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } 
            else {
                if(quitaVida()) {
                    System.out.println("Incorrecto. " + (intento < numeroAAdivinar ? "Es mayor." : "Es menor.") + " Intenta de nuevo.");
                } else {
                    System.out.println("Te has quedado sin vidas. El numero era " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
    */
    //Valida Numero
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = rand.nextInt(11);
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            int intento = scanner.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Numero fuera de rango. Intente nuevamente.");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    System.out.println("Incorrecto. " + (intento < numeroAAdivinar ? "Es mayor." : "Es menor.") + " Intenta de nuevo.");
                } else {
                    System.out.println("Te has quedado sin vidas. El numero era " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
    
}