package teoria.parametrizacion;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%S - %s", nombre, fechaNacimiento.toString());
    }
}
