package ejercicios.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarjetaCredito {
    private String numeroTarjeta;
    private String titularTarjeta;
    private LocalDate fechaCreacionTarjeta = LocalDate.now();

    public TarjetaCredito(String numeroTarjeta, String titularTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.titularTarjeta = titularTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public LocalDate getFechaCreacionTarjeta() {
        return fechaCreacionTarjeta;
    }

    public void setFechaCreacionTarjeta(LocalDate fechaCreacionTarjeta) {
        this.fechaCreacionTarjeta = fechaCreacionTarjeta;
    }

    @Override
    public String toString() {
        DateTimeFormatter fechaFormateadaConGuion =
            DateTimeFormatter.ofPattern("LL/yy");

        return String.format("%S%n%s%n%s", titularTarjeta, numeroTarjeta,
                fechaCreacionTarjeta.plusYears(4).format(fechaFormateadaConGuion));
    }

    public static boolean validarTarjeta (String tarjeta) { // 1,2 .... 16 cifras
        class NumeroTarjeta {  //cifra 16 es la de control
            private String numeroTarjetaSinDC;  // 1,2, .. 15 (sin dígito de control)

            public NumeroTarjeta(String numeroTarjetaSinDC) {
                this.numeroTarjetaSinDC = numeroTarjetaSinDC;
            }
            public String obtenerTarjetaConDC() {
                //código calcular el DC
                int suma = 0;
                for (int i= 0; i < numeroTarjetaSinDC.length(); i++ ){
                    if (i % 2 == 0) {
                       int tmp = Integer.parseInt(numeroTarjetaSinDC.charAt(i) + "") * 2;
                        if (tmp >= 10)
                            suma +=  tmp - 9;
                        else
                            suma += tmp;
                    }
                    else
                        suma += Integer.parseInt(
                                numeroTarjetaSinDC.charAt(i) + "");
                }

                String digitoControl = (suma % 10) + "";
                return numeroTarjetaSinDC + digitoControl;   // 1, 2, ... 16 con DC
            }
        }
        if (!tarjeta.matches("[0-9]{16}"))
            return false;  //no son 16 dígitos que es lo que forma una tarjeta
         NumeroTarjeta numeroTarjeta = new NumeroTarjeta(
                tarjeta.substring(0, tarjeta.length() - 1));
        return tarjeta.equals(numeroTarjeta.obtenerTarjetaConDC());
    }

    public static void main(String[] args) {
        String tarjeta = "416881884444711";
        if (validarTarjeta(tarjeta)) {
            TarjetaCredito t = new TarjetaCredito(
                    "122223", "perico gonzález");
            System.out.println(t);
        }

    }
}
