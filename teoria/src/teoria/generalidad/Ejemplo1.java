package teoria.generalidad;

public class Ejemplo1 {
    public static void main(String[] args) {
        double valor = 5.7;
        System.out.printf("Raíz cuadrada de %.2f vale %.2f%n",
                valor, Math.sqrt(valor));
        System.out.printf("Raíz cúbica de %.2f vale %.2f%n",
                valor, Math.cbrt(valor));
        System.out.printf("%.2f elevado a %.2f vale %.2f%n",
                valor, -2.6 ,Math.pow(valor, -2.6));

    }
}
