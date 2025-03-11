package Practica_4;

public class FiguraGeometrica {
	//Area del circulo
    public double area(double radio) {
        return (Math.PI * radio * radio);
    }

    //Area del rectangulo
    public double area(double base, double altura) {
        return base * altura;
    }

    //Area del triangulo rectangulo
    public double area(double base, double altura, boolean esTriangulo) {
        if (esTriangulo) {
            return (base * altura) / 2;
        }
        return base * altura;
    }

    //Area del trapecio
    public double area(double base1, double base2, double altura) {
        return ((base1 + base2) * altura) / 2;
    }

    //Area del pentagono
    public double area(double lado, double apotema, int lados) {
        if (lados == 5) {
            return (5 * lado * apotema) / 2;
        }
        return 0;
    }
}