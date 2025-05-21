package Java.Fila_B;

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
	//b  Calcular el promedio de años Experiencia de los artistas de ambas pinturas 
	public void CalcularPromedioAñosExperiencia() {
		System.out.println("PROMEDIO DE AÑOS DE EXPERIENCIA DE LOS ARTISTAS");
		Artista a = a1;
		Artista b = a2;
		double promedio=0;
		promedio= ((a.getAñosExperiencia()+b.getAñosExperiencia())/2);
		System.out.println("Promedio: "+promedio);
		
	}
	//c
	public void IncrementaPrecioXArtistaNombreX(double incremento, String nombreArtista) {
	    System.out.println("INCREMENTAMOS EL PRECIO EN X A LA PINTURA DEL ARTISTA CON NOMBRE X");
	    
	    if (a1.getNombre().equalsIgnoreCase(nombreArtista) || 
	        a2.getNombre().equalsIgnoreCase(nombreArtista)) {
	        
	        b.setPrecio(b.getPrecio() + incremento);
	        System.out.println("Precio Incrementado: " + b.getPrecio());
	        
	    } else {
	        System.out.println("No se encontro al artista con nombre: " + nombreArtista);
	    }
	}
}
