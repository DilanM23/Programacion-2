package Java.Fila_A;

public class Main {
	public static void main(String[] args) {
		//a) Crear un objeto pintura que tenga un anuncio y otro objeto pintura sin anuncio 
		Artista a1 = new Artista("Franco", 2468, 4);
		Artista a2 = new Artista("Jael", 1357, 6);
		Artista a3 = new Artista("Jesika", 7531, 3);
		Artista a4 = new Artista("Emanuel", 8642, 8);
		
		Anuncio an1 = new Anuncio(1, 2400);
		
		Pintura p1 = new Pintura("Monalisa", "Oleo", a1, a2, an1, "Contemporaneo");
		Pintura p2 = new Pintura("Titanic", "Tela", a3, a4, null, "Paisaje");
		//Mostramos los Objetos
		p1.mostrar();
		
		//b) Mostrar el nombre del artista con más años de Experiencia de ambas pinturas
		System.out.println("\tINCISO B");
		p1.MostrarNombreArtistaMasExperiencia();
		p2.MostrarNombreArtistaMasExperiencia();
		
		//c) Se ha decidido vender la pintura sin anuncio, se pide agregar un anuncio de venta y determine el
		//monto total de venta de ambas pinturas. 
		//Creamos el Anuncio y Agregamos a la Pintura 2
		System.out.println("\tINCISO C");
		Anuncio an2 = new Anuncio(1, 1500);
		p2.b=an2;
		p2.mostrar();
		//Sumamos el Precio total de la Pintura 1 y Pintura 2
		System.out.println("MONTO TOTAL DE VENTA DE LA PINTURA 1 Y PINTURA 2");
		double precio_total = p1.b.getPrecio()+p2.b.getPrecio();
		System.out.println("El Precio es: "+precio_total);
	}
}
