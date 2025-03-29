package Practica_6;

public class Main {

	public static void main(String[] args) {
		AlgebraVectorial a = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial b = new AlgebraVectorial(6, 8, 0);

        System.out.println("¿Son perpendiculares? " + AlgebraVectorial.sonPerpendiculares(a, b));
        System.out.println("¿Son paralelos? " + AlgebraVectorial.sonParalelos(a, b));

        AlgebraVectorial proyeccion = a.proyeccionSobre(b);
        System.out.println("Proyección de a sobre b: (" + proyeccion.x + ", " + proyeccion.y + ", " + proyeccion.z + ")");

        double componente = a.componenteEn(b);
        System.out.println("Componente de a en b: " + componente);

	}

}
