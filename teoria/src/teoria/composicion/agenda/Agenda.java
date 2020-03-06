package teoria.composicion.agenda;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private String nombre;
    private List<Contacto> lista = new ArrayList<>();

    public Agenda(String nombre) {
        this.nombre = nombre;
    }

    public boolean annadirContacto (Contacto contacto){
        return lista.add(contacto);
    }
    public boolean annadirContacto (List<Contacto> lista){
        return this.lista.addAll(lista);
    }

    //para que funcione el método remove, Contacto debe tener
    //sobreescrito los métodos equals y hasCode
    public boolean eliminarContacto (Contacto contacto) {
        return  lista.remove(contacto);
    }
    public void resetearAgenda() {
        lista.clear();
    }

    //para que funcione el método contains, Contacto debe tener
    //sobreescrito los métodos equals y hasCode
    public boolean existeContacto(Contacto contacto){
        return lista.contains(contacto);
    }

    public List<Contacto> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nombre.toUpperCase());
        stringBuilder.append("\n--------------------------------\n");
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        for (Contacto c: lista) {
            stringBuilder.append(c.toString());
        }

        return stringBuilder.toString();
    }
}
