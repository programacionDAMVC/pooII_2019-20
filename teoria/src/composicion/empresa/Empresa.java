package composicion.empresa;

import composicion.empresa.excepeciones.CIFExcepecion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private List<Trabajador> listaTrabajadores = new ArrayList<>();
    private String cifEmpresa;
    private String nombreEmpresa;

    public Empresa(List<Trabajador> listaTrabajadores, String cifEmpresa, String nombreEmpresa)
            throws CIFExcepecion {
        if ( esCorrectoCIF(cifEmpresa)) {
            this.listaTrabajadores = listaTrabajadores;
            this.cifEmpresa = cifEmpresa;
            this.nombreEmpresa = nombreEmpresa;
        }
        else
            throw new CIFExcepecion();
    }

    public Empresa(String cifEmpresa, String nombreEmpresa) throws CIFExcepecion {
        if ( esCorrectoCIF(cifEmpresa)) {
            this.cifEmpresa = cifEmpresa;
            this.nombreEmpresa = nombreEmpresa;
        }
        else
            throw new CIFExcepecion();
    }

    private static boolean esCorrectoCIF(String cifEmpresa) {
        return cifEmpresa.toLowerCase().matches("^[a-hjnp-su-w][0-9]{8}");
    }

    public boolean annadirTrabajador(Trabajador trabajador) {
        return listaTrabajadores.add(trabajador);
    }

    public boolean existeTrabajador (Trabajador trabajador) {
        return listaTrabajadores.contains(trabajador);
    }
    public Trabajador buscarTrabajador (String dni) {
        for ( Trabajador t: listaTrabajadores ) {
            if (t.getDni().equalsIgnoreCase(dni))
                return t;
        }
        return null;
    }

    public boolean eliminarTrabajador (Trabajador trabajador){
        return listaTrabajadores.remove(trabajador);
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nombreEmpresa.toUpperCase());
        stringBuilder.append(" - ");
        stringBuilder.append(cifEmpresa);
        stringBuilder.append("\n");
        for (Trabajador t: listaTrabajadores) {
            stringBuilder.append(t.toString());
        }

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(cifEmpresa, empresa.cifEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cifEmpresa);
    }
}
