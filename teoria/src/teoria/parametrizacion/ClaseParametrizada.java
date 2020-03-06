package teoria.parametrizacion;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada<T> {
    private List<T> listaObjetos = new ArrayList<>();
    public boolean annadirObjeto (T t){
        return listaObjetos.add(t);
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       int contador = 1;
        for (T t: listaObjetos) {
            stringBuilder.append(contador++);
            stringBuilder.append(".- ");
            stringBuilder.append(t);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
