package composicion.empresa;

import composicion.empresa.excepeciones.DNIExcepecion;
import composicion.empresa.excepeciones.FechaNacimientoExcepcion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Trabajador {
    private String dni;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;

    public Trabajador(String dni, String nombreCompleto,String fechaNacimiento) throws DNIExcepecion, FechaNacimientoExcepcion {
        if (!esDNICorrecto(dni))
            throw new DNIExcepecion();
        else if(!esFechaNacimientoCorrecta(fechaNacimiento))
            throw new FechaNacimientoExcepcion();
        else {
            this.dni = dni;
            this.nombreCompleto = nombreCompleto;
            this.fechaNacimiento = formatearFecha(fechaNacimiento);
        }
            
    }

    private static LocalDate formatearFecha(String fechaNacimiento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY");
        LocalDate localDate = LocalDate.parse(fechaNacimiento, formatter);
        return localDate;
    }

    private static boolean esFechaNacimientoCorrecta(String fechaNacimiento) {
        String dias  = "(0[1-9]|[1-2][0-9]|3[0-1])";
        String meses = "(0[1-9]|1[0-2])";
        String annos = "[0-9]{2}";
        return fechaNacimiento.matches(dias + "-" + meses + "-" + annos );
    }

    private static boolean esDNICorrecto(String dni) {
        return dni.toLowerCase().matches("^[0-9]{8}[a-z]$");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%S, %s.%nFecha de nacimiento: %s%n",
                nombreCompleto, dni, fechaNacimiento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public static void main(String[] args) {
        try {
            Trabajador t = new Trabajador("12345678a", "juan",
                    "10-10-10");
            System.out.println(t);
        } catch (DNIExcepecion   | FechaNacimientoExcepcion e ) {
            System.out.println(e.getMessage());
        }
    }
}
