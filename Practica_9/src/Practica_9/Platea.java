package Practica_9;

public class Platea extends Boleto {
	protected int diasAnticipacion;

    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }

    protected void calcularPrecio() {
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } 
        else {
            this.precio = 60.0;
        }
    }
}