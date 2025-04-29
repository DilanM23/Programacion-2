package Practica_9;

public class Galeria extends Platea {
	
	public Galeria(int numero, int diasAnticipacion) {
        super(numero, diasAnticipacion);
    }

    @Override
    protected void calcularPrecio() {
        if (diasAnticipacion >= 10) {
            this.precio = 25.0;
        } 
        else {
            this.precio = 30.0;
        }
    }
}