package Practica;

public class Main {

	public static void main(String[] args) {
		D d = new D(1, 2, 3);
		// Incrementa x, y, z
        d.incrementaXYZ();
        // Incrementa x y z de A
        d.a.incrementaXZ(); 
        // Incrementa y y z de B
        d.b.incrementaYZ();
        // Incrementa z de A
        d.a.incrementaZ();  
        // Incrementa z de B
        d.b.incrementaZ(); 

        d.mostrar();
	}
}
