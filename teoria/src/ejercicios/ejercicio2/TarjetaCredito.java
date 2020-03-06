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
            DateTimeFormatter.ofPattern("dd-LL-yyyy");
        return String.format("TARJETA CRÉDITO: %s, %s, %s", numeroTarjeta, titularTarjeta,
                fechaCreacionTarjeta.format(fechaFormateadaConGuion));
    }

    public static boolean validarTarjeta (String tarjeta) {
        class NumeroTarjeta {
            private String numeroTarjetaSinDC;

            public NumeroTarjeta(String numeroTarjetaSinDC) {
                this.numeroTarjetaSinDC = numeroTarjetaSinDC;
            }
            public String obtenerTarjetaConDC() {
                //código calcular el DC
                String DC = "";
                return numeroTarjetaSinDC + DC;
            }
        }
        NumeroTarjeta numeroTarjeta = new NumeroTarjeta(
                tarjeta.substring(0, tarjeta.length() - 1));
        return tarjeta.equals(numeroTarjeta.obtenerTarjetaConDC());
    }

    public static void main(String[] args) {

        TarjetaCredito t = new TarjetaCredito(
                "122223", "perico gonzález");
        System.out.println(t);

    }
}
