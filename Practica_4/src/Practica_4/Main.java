package Practica_4;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica figura=new FiguraGeometrica();
        
        System.out.println("Area del Circulo: " + figura.area(5));
        System.out.println("Area del Rectangulo: " + figura.area(4, 6));
        System.out.println("Area del Triangulo Rectangulo: " + figura.area(4, 4, true));
        System.out.println("Area del Trapecio: " + figura.area(3, 5, 4));
        System.out.println("Area del Pentagono: " + figura.area(6, 4, 5));

	}

}
