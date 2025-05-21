package Java.Fila_A;

public class Artista {
	String nombre;
	int ci;
	int añosExperiencia;
	
	public Artista(String nombrex, int cix, int añosExperienciax) {
		this.nombre=nombrex;
		this.ci=cix;
		this.añosExperiencia=añosExperienciax;
	}
	public void mostrar() {
		System.out.println("ARTISTA");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("C.I.: "+this.ci);
		System.out.println("Años Experiencia: "+this.añosExperiencia);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
}
