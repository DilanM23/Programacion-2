package Practica_9;

public class Palco extends Boleto {
	
	public Palco(int numero) {
        super(numero);
        calcularPrecio();
    }
	//Precio del Boleto PALCO
    @Override
    public void calcularPrecio() {
        this.precio = 100.0;
    }
}