package Java.Fila_A;

public class Pintura extends Obra {
	String genero;
	
	public Pintura(String titulox, String materialx, Artista a1x, Artista a2x, Anuncio bx, String generox) {
		super(titulox, materialx, a1x, a2x, bx);
		this.genero=generox;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("PINTURA");
		System.out.println("Genero: "+this.genero);
	}
	//b) Mostrar el nombre del artista con más años de Experiencia
	public void MostrarNombreArtistaMasExperiencia() {
		System.out.println("<ARTISTA CON MAS EXPERIENCIA>");
		Artista a = a1;
		Artista b = a2;
		int mayor=0;
		if (a.getAñosExperiencia()>b.getAñosExperiencia()) {
			System.out.println("Artista con Mas Experiencia: "+a.getNombre());
		}	
		else {
			System.out.println("Artista con Mas Experiencia: "+b.getNombre());
		}
		System.out.println();
	}
}
