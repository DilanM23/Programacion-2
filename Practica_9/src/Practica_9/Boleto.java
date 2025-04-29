package Practica_9;

public abstract class Boleto {
	protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    protected abstract void calcularPrecio();

    public String toString() {
        return "Numero: " + numero + ", Precio: " + precio;
    }
}