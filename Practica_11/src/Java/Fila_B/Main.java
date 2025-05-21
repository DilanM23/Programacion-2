package Java.Fila_B;

public class Main {
	public static void main(String[] args) {
		//a) Crear dos objetos pintura que tengan anuncios de venta  
		Artista a1 = new Artista("Franco", 2468, 4);
		Artista a2 = new Artista("Jael", 1357, 6);
		Artista a3 = new Artista("Jesika", 7531, 3);
		Artista a4 = new Artista("Emanuel", 8642, 8);
		Anuncio an1 = new Anuncio(1, 2400);
		Anuncio an2 = new Anuncio(1, 1500);
		Pintura p1 = new Pintura("Monalisa", "Oleo", a1, a2, an1, "Contemporaneo");
		Pintura p2 = new Pintura("Titanic", "Tela", a3, a4, an2, "Paisaje");
		//Mostramos los Objetos
		p1.mostrar();
		p2.mostrar();
		//b)  Calcular el promedio de años Experiencia de los artistas de ambas pinturas
		System.out.println("\tINCISO B");
		p1.CalcularPromedioAñosExperiencia();
		//c) Incrementar el precio en X a la pintura del artista con nombre X
		System.out.println("\tINCISO C");
		p2.IncrementaPrecioXArtistaNombreX(10,"Jesika");		
	}
}
