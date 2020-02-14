package composicion;

import java.util.Objects;

class Contacto {
    private String nombre;
    private String numeroTelefono;

    public Contacto(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return String.format("%S - %s%n", nombre, numeroTelefono);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(numeroTelefono, contacto.numeroTelefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroTelefono);
    }
}
