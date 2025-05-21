package Java.Fila_A;

public class Obra {
	String titulo;
	String material;
	Artista a1 = new Artista("Pablo Picasso", 12345, 20);
	Artista a2 = new Artista("Claude Monet", 67890, 24);
	Anuncio b = new Anuncio(1, 3500);
	
	public Obra(String titulox, String materialx, Artista a1x, Artista a2x, Anuncio bx) {
		this.titulo=titulox;
		this.material=titulox;
		this.a1=a1x;
		this.a2=a2x;
		this.b=bx;
	}
	public void mostrar() {
		System.out.println("OBRA");
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Material: "+this.material);
		a1.mostrar();
		a2.mostrar();
		b.mostrar();
	}
}
