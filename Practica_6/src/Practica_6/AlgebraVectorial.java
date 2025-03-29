package Practica_6;

class AlgebraVectorial {
    double x, y, z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static boolean sonPerpendiculares(AlgebraVectorial a, AlgebraVectorial b) {
        return a.productoPunto(b) == 0;
    }

    public static boolean sonParalelos(AlgebraVectorial a, AlgebraVectorial b) {
        return a.productoCruz(b).esNulo();
    }

    public double productoPunto(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    public AlgebraVectorial productoCruz(AlgebraVectorial b) {
        return new AlgebraVectorial(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }

    public boolean esNulo() {
        return this.x == 0 && this.y == 0 && this.z == 0;
    }

    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / b.productoPunto(b);
        return new AlgebraVectorial(b.x * escalar, b.y * escalar, b.z * escalar);
    }

    public double componenteEn(AlgebraVectorial b) {
        return this.productoPunto(b) / b.magnitud();
    }
}