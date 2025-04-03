package Practica_7;

public class Main {
	public static void main(String[] args) {
		//JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
        //juego.juega();
        
		JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        //Jugada entre 1-10
        System.out.println("<--NUMEROS ENTRE 0-10-->");
        juegoNumero.juega();
        //Jugada entre Numeros Pares
        System.out.println("<--NUMEROS PARES ENTRE 0-10-->");
        juegoPar.juega();
        //Jugada entre Numeros Impares
        System.out.println("<--NUMEROS IMPARES ENTRE 0-10-->");
        juegoImpar.juega();
	}
}
