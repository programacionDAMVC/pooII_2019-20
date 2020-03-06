package ejercicios.ejercicio1;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        System.out.println(r1);
        Rectangulo r2 = new Rectangulo(1,3);
        System.out.println(r2);
        Rectangulo r3 = new Rectangulo(2.3, 1.5);
        System.out.println(r3);
        System.out.printf("Nº de rectángulos %d%n",
                Rectangulo.getNumeroRectangulos());
        System.out.printf("Nº de rectángulos %d%n",
                Rectangulo.ObtenerNumeroRectangulos.valor());

    }
}
