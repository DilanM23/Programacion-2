package Java.Fila_B;

public class Anuncio {
	int numero;
	double precio;
	
	public Anuncio(int numerox, double preciox) {
		this.numero=numerox;
		this.precio=preciox;
	}
	public void mostrar() {
		System.out.println("ANUNCIO");
		System.out.println("Nro.: "+this.numero);
		System.out.println("Precio: "+this.precio);
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}	
}
