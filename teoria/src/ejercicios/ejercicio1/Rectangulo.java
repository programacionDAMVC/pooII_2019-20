package ejercicios.ejercicio1;

public class Rectangulo {

    private double alto = 1;
    private double ancho = 1;
    private static int numeroRectangulos = 0; //lo idóneo es hacer esta variable pública

    public Rectangulo() {
        numeroRectangulos++;
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        numeroRectangulos++;
    }

    public double calcularPerimetro() {
        return alto * 2 + ancho * 2;
    }

    public double calcularArea() {
        return alto * ancho;
    }

    public static int getNumeroRectangulos() {
        return numeroRectangulos;
    }

    public static class ObtenerNumeroRectangulos {
        public static int valor() {
            return numeroRectangulos;
        }
    }

    @Override
    public String toString() {
        return String.format("Rectángulo: alto %.2f, ancho %.2f, área %.2f y perímetro %.2f",
                alto, ancho, calcularArea(), calcularPerimetro());
    }


}
